package com.nasdaq.my_application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Calculator.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My Calculator");

		System.out.println("Simple Calculator Operations");
		System.out.println("Addition of 10 and 20 is: " + SimpleCalculatorOperations.add(10, 20));
		System.out.println("Subtraction of 10 and 20 is: " + SimpleCalculatorOperations.subtract(10, 20));
		System.out.println("Multiplication of 10 and 20 is: " + SimpleCalculatorOperations.multiply(10, 20));
		System.out.println("Division of 10 and 20 is: " + SimpleCalculatorOperations.divide(10, 20));
		System.out.println("Modulus of 10 and 20 is: " + SimpleCalculatorOperations.modulus(10, 20));
		System.out.println("Power of 10 and 20 is: " + SimpleCalculatorOperations.power(10, 20));
		System.out.println("Square root of 10 is: " + SimpleCalculatorOperations.sqrt(10));

		System.out.println("Trigonometric Operations");
		System.out.println("Sin of 90 is: " + TrigonometricOperations.sin(TrigonometricOperations.toRadians(90)));
		System.out.println("Cos of 0 is: " + TrigonometricOperations.cos(TrigonometricOperations.toRadians(0)));
		System.out.println("Tan of 45 is: " + TrigonometricOperations.tan(TrigonometricOperations.toRadians(45)));
		System.out.println("Asin of 0 is: " + TrigonometricOperations.asin(TrigonometricOperations.toRadians(0)));
		System.out.println("Acos of 0 is: " + TrigonometricOperations.acos(TrigonometricOperations.toRadians(0)));
		System.out.println("Atan of 90 is: " + TrigonometricOperations.atan(TrigonometricOperations.toRadians(90)));
		System.out.println("ToDegrees of 3.141592 is: " + TrigonometricOperations.toDegrees(3.141592));
		System.out.println("ToRadians of 180 is: " + TrigonometricOperations.toRadians(180));
		System.out.println("Log of 100 is: " + TrigonometricOperations.log10(100));

	}
}
