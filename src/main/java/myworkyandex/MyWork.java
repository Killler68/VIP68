package myworkyandex;

import java.util.Scanner;

public class MyWork {
    public static Scanner scanner = new Scanner(System.in);

    private static final MyWorkMenu menu = new MyWorkMenu();
    private static final MyWorkCurrency currency = new MyWorkCurrency();
    private static final MyWorkRecommendation recommendations = new MyWorkRecommendation();
    private static final MyWorkExpense expensesManager = new MyWorkExpense();
    private static final MyWorkCalculator Calculator = new MyWorkCalculator();

    private static final double[] expenses = new double[7];

    public static void main(String[] args) {

        System.out.println("Введите сумму ");
        double num1 = scanner.nextDouble();

        while (true) {
            menu.printMenu();

            int operation = scanner.nextInt();

            switch (operation) {
                case 1 :
                currency.Currency(num1);
                break;
                case 2 :
                recommendations.Recommendations(num1);
                break;
                case 3 :
                num1 = expensesManager.Expense(num1, scanner, expenses);
                break;
                case 4 :
                expensesManager.ExpenseDay(expenses);
                break;
                case 5 :
                System.out.println("Максимальная трата составила " + expensesManager.MaxExpense(expenses));
                break;
                case 6 :
                System.out.println("Результат " + Calculator.Calc());
                break;
                case 7 :
                System.out.println("Выход");
                return;
            }
        }
    }
}


