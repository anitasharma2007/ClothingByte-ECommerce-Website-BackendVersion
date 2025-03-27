# Clothing E-commerce Website Backend

This repository contains the backend code for the **Clothing E-commerce Website**. The system is designed to provide a streamlined process for managing products, orders, users, and payments securely and efficiently.

## Features
- **Product Management**: Allows admins to add, update, and remove clothing products.
- **User Authentication & Authorization**: Implements secure login and registration using JWT.
- **Shopping Cart & Orders**: Enables users to add products to the cart, place orders, and track purchases.
- **Payment Integration**: Supports secure online payments through Stripe/Razorpay.
- **Review & Ratings**: Users can leave reviews and rate products.
- **Admin Dashboard**: Admins can manage products, orders, and user roles.

## Technologies Used

### **Framework: Spring Boot**
**Spring Boot** is an open-source Java-based framework used for building stand-alone, production-grade Spring-based applications with minimal setup. It provides a rapid development environment by leveraging the Spring ecosystem and convention-over-configuration principles.

Example Use Cases within the Clothing E-commerce Application:

- Building RESTful APIs for managing products, orders, and users.
- Developing backend services for handling authentication, authorization, and data management.
- Ensuring production-grade reliability and performance.

### **Key Benefits for the Clothing E-commerce Backend:**
- Rapid development and deployment of server-side logic.
- Reduced overhead with minimal setup and configuration.
- Seamless integration with other components of the application stack.

## **Database: SQL SERVER 2017**

### **Master Tables:**
Master tables store reference data that remains relatively static and is used to populate dropdown lists, provide lookup values, or maintain consistent values across the application. These tables often have primary keys that serve as unique identifiers for each record.

| Table Name  | Description  |
|-------------|-------------|
| Category    | Stores different product categories like Men's, Women's, Kids' Wear, etc. |
| Brand       | Contains names of various clothing brands. |
| Size        | Stores available sizes (S, M, L, XL, etc.). |
| Color       | Stores available colors for products. |
| Payment Method | Stores different payment options available. |

### **Transaction Tables:**
Transaction tables store dynamic data that is frequently updated as part of regular operations within the application. These tables often have foreign keys to establish relationships with master tables and maintain data integrity.

| Table Name  | Description  |
|-------------|-------------|
| Users       | Stores user details like name, email, and role (admin/customer). |
| Products    | Contains product details including name, price, stock, and category. |
| Cart        | Stores items added to the shopping cart by users. |
| Orders      | Contains order details, including user ID, product ID, quantity, and status. |
| Payments    | Stores transaction details for each order. |
| Reviews     | Contains user reviews and ratings for products. |

## **REST APIs:**
Attaching collection from **Postman** to test the REST APIs for the Clothing E-commerce application.

