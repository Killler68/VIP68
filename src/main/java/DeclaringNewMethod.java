package main.java;

public class DeclaringNewMethod {
    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
        System.out.println("Самая большая трата недели " + maxExpense);
    }

    public static double findMaxExpense(double[] expenses) {
        double maxExpense = expenses[0];

        for (double expense : expenses) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }
}