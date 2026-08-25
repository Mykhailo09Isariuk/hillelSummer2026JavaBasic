package com.example.app;

import com.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double a = 10;
        double b = 5;

        System.out.println("Додавання: " + calculator.add(a, b));
        System.out.println("Віднімання: " + calculator.subtract(a, b));
        System.out.println("Множення: " + calculator.multiply(a, b));
        System.out.println("Ділення: " + calculator.divide(a, b));
    }
}