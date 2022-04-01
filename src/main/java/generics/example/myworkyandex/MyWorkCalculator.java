package generics.example.myworkyandex;

import java.util.Scanner;

public class MyWorkCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public  double Calc() {

        System.out.println("Введите первое число ");
        double a = scanner.nextDouble();
        System.out.println("Введите знак");
        String operator = scanner.next();
        System.out.println("Введите второе число ");
        double b = scanner.nextDouble();

        return Operation(operator, a, b);
    }


    public static double Operation(String operator, double a, double b) {

        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
