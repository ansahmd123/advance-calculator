package com.nasdaq.my_application;

import org.junit.jupiter.api.Test;

public class TrigonometricOperationsTests {
    @Test
    void testSin() {
        assert TrigonometricOperations.sin(TrigonometricOperations.toRadians(90)) == 1.0;
    }

    @Test
    void testCos() {
        assert TrigonometricOperations.cos(TrigonometricOperations.toRadians(0)) == 1.0;
    }

    @Test
    void testTan() {
        assert TrigonometricOperations.tan(TrigonometricOperations.toRadians(45)) == 0.9999999999999999;
    }

    @Test
    void testAsin() {
        assert TrigonometricOperations.asin(TrigonometricOperations.toRadians(0)) == 0.0;
    }

    @Test
    void testAcos() {
        assert TrigonometricOperations.acos(TrigonometricOperations.toRadians(0)) == 1.5707963267948966;
    }

    @Test
    void testAtan() {
        assert TrigonometricOperations.atan(TrigonometricOperations.toRadians(90)) == 1.0038848218538872;
    }

    @Test
    void testToDegrees() {
        assert TrigonometricOperations.toDegrees(3.141592) == 179.99996255206332;
    }

    @Test
    void testToRadians() {
        assert TrigonometricOperations.toRadians(180) == 3.141592653589793;
    }

    @Test
    void testLog() {
        assert TrigonometricOperations.log10(100) == 2.0;
    }

}
