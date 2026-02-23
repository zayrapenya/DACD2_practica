package org.example;


public class Calculator {
    public double calculate(String operation, double a, double b) {
        if (operation.equals("add")) {
            return a + b;
        } else if (operation.equals("subtract")) {
            return a - b;
        } else if (operation.equals("multiply")) {
            return a * b;
        } else if (operation.equals("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
        }
        throw new IllegalArgumentException("Unknown operation: " + operation);
    }
}
