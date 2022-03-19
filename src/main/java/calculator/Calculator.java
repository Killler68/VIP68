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

    }
    public static  int calc ( String operator, int a, int b) {
        int c;
        switch (operator) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                c = a = b;
        }
        return c;
    }
}






