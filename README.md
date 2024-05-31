# Git Java Assignment 3
This repository is made to complete Assignment 3 Java of GIT Scholarship

## Setup
This repository contains Spring Boot Application with these specifications:
* Maven
* Java 17
* JDK 21
* PostgreSQL
The application will connect to the local database `java-2`. Change database config in `application.properties`

## Endpoint
|       Endpoint       |           Function          |
|:--------------------:|:---------------------------:|
| GET /products        | Get all products            |
| GET /products/:id    | Get one product based on id |
| POST /products       | Add new product             |
| DELETE /products/:id | Delete product based on id  |
