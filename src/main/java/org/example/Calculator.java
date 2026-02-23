package org.example;



public class Calculator {
    public double calculate(Operation operation, double a, double b) {
        switch (operation) {
            case ADD:
                return a + b;
            case SUBSTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new IllegalArgumentException("No se puede dividir por cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
    }

    private double add(double a, double b) {
        return a + b;
    }
    private double subtract(double a, double b) {
        return a - b;
    }
    private double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

}
