package com.carrental;

public class Main{
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}

/*
 DESCRIPTION:
 Developed a dynamic Car Rental System in Java focusing on OOP principles 
 like inheritance, encapsulation, and polymorphism. 
 Implement a console-based user interface for smooth interactions, 
 rental operations, and real-time inventory management. 
 Incorporate dynamic pricing and detailed billing calculations.
 */