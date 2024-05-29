# Spring Boot Payment Project
This is a demo project built with Spring Boot that demonstrates how to use the Factory and Strategy design patterns to implement a flexible and extensible payment system. The project adheres to the SOLID principles, particularly the Open/Closed Principle, allowing for easy extension with new payment methods without modifying existing code.

### Project Overview
The project supports two types of payment methods:

    Credit Card
    Wired Transfer

Additional payment methods can be easily added in the future.

### Design Patterns Used
**Factory Pattern**
The Factory pattern is used to create instances of different payment strategies. This allows for the instantiation of payment methods at runtime based on the type of payment.

**Strategy Pattern**
The Strategy pattern is used to define a family of algorithms (payment methods), encapsulate each one, and make them interchangeable. This pattern lets the payment method vary independently from the clients that use it.

### SOLID Principles
The project follows the SOLID principles, with a focus on the Open/Closed Principle, which states that classes should be open for extension but closed for modification. This is achieved by using the Strategy pattern to add new payment methods without changing the existing code.

src/main/java/com/example/payment
├── PaymentApplication.java
├── factory
│   ├── PaymentFactory.java
├── strategy
│   ├── PaymentStrategy.java
│   ├── CreditCardPayment.java
│   ├── WiredTransferPayment.java
├── service
│   ├── PaymentService.java
└── controller
    ├── PaymentController.java
