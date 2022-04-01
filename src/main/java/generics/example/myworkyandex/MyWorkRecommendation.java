package generics.example.myworkyandex;

import java.util.Scanner;

public class MyWorkRecommendation {
    public static Scanner scanner = new Scanner(System.in);

    public  void Recommendations(double num1) {
        System.out.println("Дней до зарплаты ");
        int day = scanner.nextInt();
        if (num1 < 1000 && day > 5) {
            System.out.println("Все печально сидите дома ");
        } else if (num1 < 1000) {
            System.out.println("Можете сегодня поесть ");
        } else if (num1 <= 5000 && day > 5 || day <= 10) {
            System.out.println("Можете куда нибудь сходить ");
        } else if (num1 > 5000 && day <= 20) {
            System.out.println("Сходите в ресторан ");
        } else if (num1 > 5000) {
            System.out.println("Сходите в пиццерию ");
        }
    }
}
