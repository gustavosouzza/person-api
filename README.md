# Person API

A RESTful API built with Java Spring Boot for managing users, departments, and projects.

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 

## Features

- CRUD operations for Users and Departments.
- Entity relationships mapping
- REST endpoints for listing, creating


## How to Run

1. Clone the repository:

```bash
git clone https://github.com/gustavosouzza/person-api.git
cd person-api
```
2. Build and run with Maven:

```bash
mvn clean install
mvn spring-boot:run
```

3. Access via browser, Postman, or curl:

```bash
http://localhost:8080/users
http://localhost:8080/users/1
http://localhost:8080/users
```
