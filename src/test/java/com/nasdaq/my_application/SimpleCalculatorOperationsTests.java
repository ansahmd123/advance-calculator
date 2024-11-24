package com.nasdaq.my_application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleCalculatorOperationsTests {

	@Test
	void testAdd() {
		assert SimpleCalculatorOperations.add(10, 20) == 30;
	}

	@Test
	void testSubtract() {
		assert SimpleCalculatorOperations.subtract(10, 20) == -10;
	}

	@Test
	void testMultiply() {
		assert SimpleCalculatorOperations.multiply(10, 20) == 200;
	}

	@Test
	void testDivide() {
		assert SimpleCalculatorOperations.divide(10, 20) == 0.5;
	}

	@Test
	void testModulus() {
		assert SimpleCalculatorOperations.modulus(10, 20) == 10;
	}

	@Test
	void testPower() {
		assert SimpleCalculatorOperations.power(2, 3) == 8;
	}

	@Test
	void testSqrt() {
		assert SimpleCalculatorOperations.sqrt(10) == 3.1622776601683795;
	}

}
