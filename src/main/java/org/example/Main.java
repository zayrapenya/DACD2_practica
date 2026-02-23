package org.example;


import org.example.Operation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(Operation.ADD, 2, 6));
        System.out.println(calculator.calculate(Operation.SUBSTRACT, 5, 2));
        System.out.println(calculator.calculate(Operation.MULTIPLY, 5, 2));
        System.out.println(calculator.calculate(Operation.DIVIDE, 9, 2));
        try {
            calculator.calculate(Operation.DIVIDE, 5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}