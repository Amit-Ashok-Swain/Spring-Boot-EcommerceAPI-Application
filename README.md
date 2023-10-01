
# <h1 align="center"> E-commerce API Application </h1>
___
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.1-brightgreen.svg" />
</a>
<a href="License url" >
        <img alt="BSD Clause 3" src="https://img.shields.io/badge/License-BSD_3--Clause-blue.svg"/>
    </a>
</p>

---

<p align="left">

## Overview

This project, named "E-commerce API Application," is a robust Spring Boot application designed for building and managing an e-commerce platform's backend. It provides a set of RESTful API endpoints that enable various e-commerce operations, such as managing products, handling orders, user authentication, and more. Whether you're building a small online store or a large-scale e-commerce platform, this application serves as a solid foundation for your backend needs.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Dependencies

The E-commerce API Application uses the following dependencies:

- **Spring Boot Starter Data JPA**
  - **Description:** Provides support for JPA (Java Persistence API) and simplifies database access using Spring Data repositories.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    ```

- **Spring Boot Starter Web**
  - **Description:** Provides support for building web applications, including RESTful APIs.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ```

- **MySQL Connector/J (Runtime Dependency)**
  - **Description:** The MySQL JDBC driver for connecting to MySQL databases.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    ```

- **Project Lombok (Optional)**
  - **Description:** A library that simplifies Java code by reducing boilerplate code, such as getters and setters.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    ```

- **Spring Boot Starter Test (For Testing)**
  - **Description:** Provides support for testing Spring Boot applications.
  - **Maven Dependency (Test Scope):**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    ```

- **Springdoc OpenAPI (Swagger UI)**
  - **Description:** Adds Swagger UI for documenting and testing your API endpoints.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.1.0</version>
    </dependency>
    ```

- **Spring Boot Starter Validation**
  - **Description:** Includes validation support for request data binding and response data rendering.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    ```



## Data Flow

In the E-commerce API application, data flows through various components to handle operations related to different entities, including users, products, orders, and addresses. Here's an overview of the data flow for each entity:

1. **User Entity**

   - **Controller Layer**

     The Controller layer handles user-related HTTP requests and routes them to the appropriate service methods.

     ```java
     // UserController.java

     @RestController
     @RequestMapping("/api/users")
     public class UserController {
         // Define user-related endpoints and methods
     }
     ```

   - **Service Layer**

     The Service layer contains business logic and interacts with the UserRepository to perform CRUD operations on user data.

     ```java
     // UserService.java

     @Service
     public class UserService {
         // Implement user-related service methods
     }
     ```

   - **Repository Layer**

     The Repository layer manages data access to the user entity using Spring Data JPA.

     ```java
     // UserRepository.java

     @Repository
     public interface UserRepository extends JpaRepository<User, Long> {
         // Define custom queries or repository methods if needed
     }
     ```

   - **User Entity**

     The User Entity represents the structure of user data in the database.

     ```java
     // User.java (User Entity)

     @Entity
     public class User {
         // Define user attributes, getters, setters, etc.
     }
     ```

2. **Product Entity**

   - **Controller Layer**

     The Controller layer handles product-related HTTP requests and routes them to the appropriate service methods.

     ```java
     // ProductController.java

     @RestController
     @RequestMapping("/api/products")
     public class ProductController {
         // Define product-related endpoints and methods
     }
     ```

   - **Service Layer**

     The Service layer contains business logic and interacts with the ProductRepository to perform CRUD operations on product data.

     ```java
     // ProductService.java

     @Service
     public class ProductService {
         // Implement product-related service methods
     }
     ```

   - **Repository Layer**

     The Repository layer manages data access to the product entity using Spring Data JPA.

     ```java
     // ProductRepository.java

     @Repository
     public interface ProductRepository extends JpaRepository<Product, Long> {
         // Define custom queries or repository methods if needed
     }
     ```

   - **Product Entity**

     The Product Entity represents the structure of product data in the database.

     ```java
     // Product.java (Product Entity)

     @Entity
     public class Product {
         // Define product attributes, getters, setters, etc.
     }
     ```

3. **Order Entity**

   - **Controller Layer**

     The Controller layer handles order-related HTTP requests and routes them to the appropriate service methods.

     ```java
     // OrderController.java

     @RestController
     @RequestMapping("/api/orders")
     public class OrderController {
         // Define order-related endpoints and methods
     }
     ```

   - **Service Layer**

     The Service layer contains business logic and interacts with the OrderRepository to perform CRUD operations on order data.

     ```java
     // OrderService.java

     @Service
     public class OrderService {
         // Implement order-related service methods
     }
     ```

   - **Repository Layer**

     The Repository layer manages data access to the order entity using Spring Data JPA.

     ```java
     // OrderRepository.java

     @Repository
     public interface OrderRepository extends JpaRepository<Order, Long> {
         // Define custom queries or repository methods if needed
     }
     ```

   - **Order Entity**

     The Order Entity represents the structure of order data in the database.

     ```java
     // Order.java (Order Entity)

     @Entity
     public class Order {
         // Define order attributes, getters, setters, etc.
     }
     ```

4. **Address Entity**

   - **Controller Layer**

     The Controller layer handles address-related HTTP requests and routes them to the appropriate service methods.

     ```java
     // AddressController.java

     @RestController
     @RequestMapping("/api/addresses")
     public class AddressController {
         // Define address-related endpoints and methods
     }
     ```

   - **Service Layer**

     The Service layer contains business logic and interacts with the AddressRepository to perform CRUD operations on address data.

     ```java
     // AddressService.java

     @Service
     public class AddressService {
         // Implement address-related service methods
     }
     ```

   - **Repository Layer**

     The Repository layer manages data access to the address entity using Spring Data JPA.

     ```java
     // AddressRepository.java

     @Repository
     public interface AddressRepository extends JpaRepository<Address, Long> {
         // Define custom queries or repository methods if needed
     }
     ```

   - **Address Entity**

     The Address Entity represents the structure of address data in the database.

     ```java
     // Address.java (Address Entity)

     @Entity
     public class Address {
         // Define address attributes, getters, setters, etc.
     }
     ```
## DataBase Design
     
#### User Table

| Column Name | Data Type | Description                       |
| ----------- | --------- | --------------------------------- |
| userId      | INT (Primary Key) | Unique identifier for each user |
| username    | VARCHAR(255) | User's username                  |
| email       | VARCHAR(255) | User's email address             |
| password    | VARCHAR(255) | Securely hashed password          |
| created_at  | TIMESTAMP | Timestamp of account creation    |
| updated_at  | TIMESTAMP | Timestamp of account modification|

#### Product Table

| Column Name | Data Type | Description                       |
| ----------- | --------- | --------------------------------- |
| productId   | INT (Primary Key) | Unique identifier for each product |
| productName | VARCHAR(255) | Name of the product               |
| price       | DECIMAL   | Price of the product              |
| quantity    | INT       | Available quantity of the product |
| description | TEXT      | Description of the product        |
| created_at  | TIMESTAMP | Timestamp of product creation     |
| updated_at  | TIMESTAMP | Timestamp of product modification |

#### Order Table

| Column Name | Data Type | Description                       |
| ----------- | --------- | --------------------------------- |
| orderId     | INT (Primary Key) | Unique identifier for each order   |
| orderStatus | VARCHAR(255) | Status of the order                |
| totalAmount | DECIMAL   | Total amount of the order         |
| created_at  | TIMESTAMP | Timestamp of order creation       |
| updated_at  | TIMESTAMP | Timestamp of order modification   |


#### Address Table

| Column Name   | Data Type       | Description                                   |
| ------------- | --------------- | --------------------------------------------- |
| addressId     | BIGINT (Primary Key) | Unique identifier for each address record   |
| streetAddress | VARCHAR(255)    | Street address of the recipient               |
| city          | VARCHAR(255)    | City where the recipient resides              |
| state         | VARCHAR(255)    | State or region of the recipient              |
| postalCode    | VARCHAR(20)     | Postal code or ZIP code of the recipient      |
| country       | VARCHAR(255)    | Country of the recipient                      |


You can create these tables in your database using SQL or an ORM tool like Hibernate based on the provided structure. Adjust the data types and constraints as per your database system's requirements.



## Data Structures Used

The project utilizes the following data structures:

#### User Class

The `User` class defines the structure for user data and includes fields such as `userId`, `username`, `email`, `password`, and timestamps.

#### Product Class

The `Product` class defines the structure for product data and includes fields such as `productId`, `productName`, `price`, `quantity`, `description`, and timestamps.

#### Order Class

The `Order` class defines the structure for order data and includes fields such as `orderId`, `orderStatus`, `totalAmount`, and timestamps.

#### ArrayList Usage

ArrayLists can be used to represent lists of items in your application. For example, you can use an ArrayList to represent a list of order items in an order.

## Project Summary

The E-commerce API Application is a comprehensive Spring Boot application designed to serve as the backend for an e-commerce platform. It offers a wide range of RESTful API endpoints for user management, product management, order processing, and more.

#### Key Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

### Data Flow

#### Controller

The Controller layer handles incoming HTTP requests and routes them to the appropriate services. It defines API endpoints for various operations related to users, products, orders, and more.

#### Services

The Services layer implements core business logic, data processing, and interaction with the data repository. It handles data validations, CRUD operations, order processing, authentication, and more.

#### Repository

The Repository layer manages data access to the underlying database. It handles database operations for users, products, and orders.

### Database Design

The project's database design includes tables for users, products, orders, and order items, each with specific fields. This design ensures data integrity and organized storage.

### Data Structures Used

The project utilizes data structures such as the `User`, `Product`, `Order`, and `OrderItem` classes to represent and manage user, product, and order data.

### Key Features

- RESTful API endpoints for user management, product management, and order processing.
- Secure user authentication and authorization with Spring Security.
- Comprehensive data validation for user registration and product management.
- Flexible order creation and management with associated order items.
- Clean code separation with a layered architecture (Controller, Services, Repository).

The E-commerce API Application serves as a robust foundation for building and managing the backend of your e-commerce platform. Whether you're developing a small online store or a large-scale marketplace, this application provides the essential functionality you need to get started.

<!-- License -->
## License

This project is licensed under the [BSD 3-Clause License](LICENSE).

<!-- Acknowledgments -->
## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact

For questions or feedback, please contact [Amit Ashok Swain](mailto:business.amitswain@gmail.com).
