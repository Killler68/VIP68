package calculator;

import java.util.Scanner;

public class Calculator {
    private static final int EXIT_COMMAND = 000;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число. Введите 000 чтобы завершить работу");
            double a = scanner.nextDouble();
            //TODO вынести условие if в отдельный метод с помощью рекурсии
            if (a == 000) {
                System.out.println("Выход");
                break;
            }
            System.out.println("Введите оператор");
            String operator = scanner.next();
            System.out.println("Введите второе число");
            double b = scanner.nextDouble();
            System.out.println("Полученное число " + calc(operator, a, b));
        }
    }

    public static double calc(String operator, double a, double b) {
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









