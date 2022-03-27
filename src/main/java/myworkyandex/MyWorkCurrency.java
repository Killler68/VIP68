package myworkyandex;

import java.util.Scanner;

public class MyWorkCurrency {
    public static Scanner scanner = new Scanner(System.in);

    public static void Currency(double num1) {
        double ruble = 50;
        double EUR = 125.3;
        double USD = 110.7;
        System.out.println("Выберите в какую валюту перевести" +
                "1.ruble    2.EUR    3.USD ");
        int currency = scanner.nextInt();
        if (currency == 1) {
            System.out.println("Результат в рублях " + num1 / ruble);
        }
        if (currency == 2) {
            System.out.println("Результат в рублях " + num1 / EUR);
        }
        if (currency == 3) {
            System.out.println("Результат в рублях " + num1 / USD);

        }
    }
}
