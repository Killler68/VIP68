package myworkyandex;

import java.util.Scanner;

public class MyWorkCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public static double Calc() {
        while (true) {
            System.out.println("Введите первое число ");
            double a = scanner.nextDouble();
            System.out.println("Введите знак");
            String operator = scanner.next();
            System.out.println("Введите второе число ");
            double b = scanner.nextDouble();

            return Operation(operator, a, b);
        }
    }

    public static double Operation(String operator, double a, double b) {

        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}
