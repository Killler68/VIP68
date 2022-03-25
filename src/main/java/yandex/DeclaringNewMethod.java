package yandex;

import java.util.Scanner;
public class DeclaringNewMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую зарплату вы получите в этом месяце?");
        int salary = scanner.nextInt();
        System.out.println("Сколько планируете потратить на транспорт?");
        int transportMoney = scanner.nextInt();
        System.out.println("Сколько запланировано на супермаркеты?");
        int foodMoney = scanner.nextInt();
        System.out.println("Какую сумму хотите отложить?");
        int savings = scanner.nextInt();

        // Вызовите метод correctExpenses с правильными аргументами
        correctExpenses(transportMoney, foodMoney, savings,salary);

        // Напечатайте запланированные траты
        System.out.println("Вы планировали потратить: транспорт — " + transportMoney + ", "
                + "еда — " + foodMoney + ", "
                + "сбережения — " + savings + ".");

    }

    // Объявите метод correctExpenses
    // Тело метода дано ниже
    public static int correctExpenses(int transportMoney, int foodMoney, int savings, int salary) {

        int expensesSum = transportMoney + foodMoney + savings; // Считаем расходы
        int leftMoney = salary - expensesSum;
        if (expensesSum > salary) { // Проверяем, не превышают ли расходы зарплату
            int lackMoney = expensesSum - salary; // Считаем, сколько не хватает
            // Считаем излишек средств

            // Пока не начнёт хватать денег на еду — сокращаем траты на 100 рублей
            while ((salary - foodMoney) < transportMoney) {
                foodMoney = foodMoney - 100;
            }
            // Если не хватает денег на жизнь — не откладываем
            if (transportMoney + foodMoney + savings > salary) {
                savings = 0;
            }

            // Печатаем рекомендации
            System.out.println("Придётся пересмотреть планы, вам не хватает " + lackMoney);
            System.out.println("Рекомендуемые траты: "
                    + "еда — " + foodMoney + ", "
                    + "сбережения — " + savings + ".");
        } else {
            System.out.println("В этом месяце дебет с кредитом сошлись!");
            System.out.println("Свободных средств " + leftMoney);
        }
        return leftMoney;
    }
}



