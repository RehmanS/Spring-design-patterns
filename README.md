# Spring Boot Payment Project
This is a demo project built with Spring Boot that demonstrates how to use the Factory and Strategy design patterns to implement a flexible and extensible payment system. The project adheres to the SOLID principles, particularly the Open/Closed Principle, allowing for easy extension with new payment methods without modifying existing code.

### Project Overview
The project supports two types of payment methods:

* **Credit Card** 
* **Wired Transfer**

Additional payment methods can be easily added in the future.

### Design Patterns Used
**Factory Pattern:**
The Factory pattern is used to create instances of different payment strategies. This allows for the instantiation of payment methods at runtime based on the type of payment.

**Strategy Pattern:**
The Strategy pattern is used to define a family of algorithms (payment methods), encapsulate each one, and make them interchangeable. This pattern lets the payment method vary independently from the clients that use it.

### SOLID Principles
The project follows the SOLID principles, with a focus on the **Open/Closed Principle**, which states that classes should be open for extension but closed for modification. This is achieved by using the Strategy pattern to add new payment methods without changing the existing code.


### Key Components
* PaymentFactory: Responsible for creating instances of payment strategies.
* PaymentStrategy: An interface defining the execute method for processing payments.
* CreditCardPayment: Implements the PaymentStrategy interface for credit card payments.
* WiredTransferPayment: Implements the PaymentStrategy interface for wired transfer payments.
* PaymentController: REST controller for handling payment requests.

### Adding a New Payment Method
To add a new payment method, follow these steps:
1. Create a new class that implements the PaymentStrategy interface.
2. Just use the new strategy without modifying existing code.

### Project Structure
``` plaintext
src/main/java/com/example/payment
├── PaymentApplication.java
├── factory
│   ├── PaymentFactory.java
├── strategy
│   ├── PaymentStrategy.java
│   ├── CreditCardPayment.java
│   ├── WiredTransferPayment.java
├── dto
│   ├── PaymentRequest.java
└── controller
    ├── PaymentController.java
```
#### Contact
For any inquiries, please contact sultanli.rehman@gmail.com

