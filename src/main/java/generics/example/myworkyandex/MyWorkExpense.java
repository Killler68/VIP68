package generics.example.myworkyandex;

import java.util.Scanner;

public class MyWorkExpense {
    double[] expenses;
    public MyWorkExpense() {
        expenses = new double[7];
    }
    public  double Expense(double num1, Scanner scanner, double[] expenses) {
        System.out.println("Выберите день недели " +
                "1. ПН  2. ВТ   3. СР   4. ЧТ   5. ПТ   6. СБ   7. ВС");
        int days = scanner.nextInt();
        System.out.println("Укажите размер траты ");
        double expense = scanner.nextDouble();
        num1 = num1 - expense;
        expenses[days - 1] = expenses[days - 1] + expense;
        System.out.println(num1);
        return num1;
    }
    public  void ExpenseDay(double[] expenses) {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + " Потрачено " + expenses[i]);
        }

    }
    public  double MaxExpense(double[] expenses) {
        double maxExpense = 0;
        for (double expens : expenses) {
            if (expens > maxExpense) {
                maxExpense = expens;
            }
        }
        return maxExpense;

    }
}
