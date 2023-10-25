export const oktaConfig = {
    clientId : "0oabpx91baHtr4ldE5d7",
    issuer : "https://dev-07266517.okta.com/oauth2/default",
    redirectUri: "https://localhost:3000/login/callback",
    scopes: ["openid", "profile", "email"],
    pkce: true,
    disableHttpsCheck:true,
}