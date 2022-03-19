package main.java.calculator;

import java.util.Scanner;

public class Calculator {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите оператор");
        String operator = scanner.next();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println( calc(operator, a, b));

    }
    public static  int calc ( String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
               return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}






