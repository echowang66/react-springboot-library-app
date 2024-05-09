# Project Name: react-springboot-library-app

## Developed and deployed a full-stack library web application on AWS EC2, featuring a self-designed initial UX model including user login, book search, shelf display, checkout, payment processing, and some library supported services.

This project is Full Stack applications with React and Java Spring Boot. These are hot skills and companies are desperately looking for develper since I did some research online. Here are most important aspects of the project:

* Built the backend using Spring Boot, utilizing REST APIs via Spring Data REST for data handling and CRUD operations, with the frontend using the React framework and TypeScript to enhance code quality and maintainability, ensuring smooth interaction between frontend and backend and accurate data transmission.
* Implemented strong security enhancements by integrating OAuth 2, OpenID Connect, and JWT to provide robust authentication mechanisms for the application, effectively protecting sensitive data and managing different user roles' permissions through Okta.
* Integrated Stripe as the payment processor to support credit card transactions and overdue book fee handling, simplifying the payment process through a pre-built Stripe Checkout interface to enhance user experience.
* Supported the conversion of user-uploaded image files to base64 format and implemented pagination on the website to improve page neatness and aesthetics, ensuring a user-friendly interface that is easy to navigate.

## Click the Website to see how it looks
<a href = "https://3.91.81.230/home">

## Some key points that may important to know:

1: In terms of Spring Boot 3, the main update is Java 17+ and renaming the Java EE packages to use jakarta namespace. In particular:

- Replace package references for: javax.persistence.*

- With package reference: jakarta.persistence.*

Those are the key changes, beyond that the Spring Boot code will work with Spring Boot 3.

2. When you want to deploy to the project to AWS, please remember to change the callback link on Okta Website
3. For some URL, you need to check your SecurityConfiguration file, and implement requestMatchers() method

## How to tweak this project for your uses

Since this is a personal project, I'd encouge you to clone and rename this project to use your own puposes. It's a good starter boilerplate.

## Find a bug?

If you found an issue or would like to submit an improvement to this project, please submit an issue using the issue tab above. If you would like to submit a PR with a fix, reference the issue you created!
