# Car-Rental-System
## Project Overview
The Car Rental System is a Java-based console application designed to facilitate car rental operations. It leverages core Object-Oriented Programming (OOP) principles to create a modular, scalable, and maintainable system. This application manages car inventory, customer interactions, and rental transactions, with features for real-time availability checking and dynamic pricing.

##Features
->Class Structuring and Design:
  -Hierarchical class structure representing cars, customers, and rentals.
  -Utilizes OOP concepts such as inheritance, encapsulation, polymorphism, and abstraction.
  
->User Interaction:
  -Intuitive console-based user interface.
  -Input validation and error handling for seamless user experience.
  
->Rental Operations:
  -Rent and return cars with real-time inventory management.
  -Track rental periods and update car availability.
  
 ->Pricing and Billing:
  -Dynamic pricing based on rental duration and car type.
  -Generate detailed billing statements.

## Project Structure
  com/carrental/
│
├── Car.java          # Car class with attributes and methods related to car operations.
├── Customer.java     # Customer class to manage customer information.
├── Rental.java       # Rental class to manage rental transactions.
├── CarRentalSystem.java # Main system class to manage the operations and user interface.
└── Main.java         # Entry point of the application.

## How to Run
1)Clone the Repository:
  git clone https://github.com/yourusername/car-rental-system.git
cd car-rental-system

2)Compile the Source Code:
  javac com/carrental/*.java

3)Run the Application:
  java com.carrental.Main

4)Follow the On-Screen Instructions:
   Choose options from the menu to rent or return cars.
   Enter required information when prompted.

   ===== Car Rental System =====
1. Rent a Car
2. Return a Car
3. Exit
Enter your choice: 1

== Rent a Car ==

Enter your name: John Doe

Available Cars:
C001 - Toyota Camry
C002 - Honda Accord
C003 - Mahindra Thar

Enter the car ID you want to rent: C001
Enter the number of days for rental: 3

== Rental Information ==

Customer ID: CUS1
Customer Name: John Doe
Car: Toyota Camry
Rental Days: 3
Total Price: $180.00

Confirm rental (Y/N): Y

Car rented successfully.

