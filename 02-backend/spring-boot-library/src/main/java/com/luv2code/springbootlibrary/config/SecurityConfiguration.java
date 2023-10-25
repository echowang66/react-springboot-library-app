package com.luv2code.springbootlibrary.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSec) throws Exception {

        // disable cross site request forgery
        httpSec.csrf().disable();

        // add cors filters
        httpSec.cors();

        // protect endpoints at api/<types>/secure
        httpSec.authorizeHttpRequests(configurer ->
                        configurer
                                .requestMatchers("/api/books/secure/**").authenticated()
                                .requestMatchers("/api/books/**", "/api/reviews/**",
                                        "api/histories/search/**",
                                        "api/messages/secure/**",
                                        "api/messages/search/**",
                                        "api/admin/secure/**",
                                        "api/payments/**",
                                        "api/payment/secure/**"


                                        ).permitAll())
                .oauth2ResourceServer().jwt();

        // add content negotiation strategy
        httpSec.setSharedObject(ContentNegotiationStrategy.class,
                new HeaderContentNegotiationStrategy());

        //force a non-empty response body for 401's to make the response friendly.
        Okta.configureResourceServer401ResponseBody(httpSec);

        return httpSec.build();
    }
}



















