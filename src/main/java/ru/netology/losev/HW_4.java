package ru.netology.losev;

import java.util.Arrays;
import java.util.Scanner;

public class HW_4 {
    public static final int MAX_TRANSACTIONS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int transactionCount = 0;

        double[] amounts = new double[MAX_TRANSACTIONS];
        boolean[] isTransfer = new boolean[MAX_TRANSACTIONS];
        String[] dates = new String[MAX_TRANSACTIONS];

        while (transactionCount < MAX_TRANSACTIONS) {
            System.out.print("Введите сумму транзакции: ");
            double income = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Транзакция является переводом? (true/false): ");
            boolean transfer = scanner.nextBoolean();
            scanner.nextLine();

            System.out.print("Введите дату транзакции: ");
            String date = scanner.nextLine();

            amounts[transactionCount] = income;
            isTransfer[transactionCount] = transfer;
            dates[transactionCount] = date;

            System.out.println("Данные о " + (transactionCount + 1) + " транзакции: " + income + ", " + transfer + ", " + date);
            System.out.println();

            transactionCount++;
        }

        System.out.println("Поиск транзакций в заданном диапазоне дат:");

        System.out.print("Введите начальную дату: ");
        String startDate = scanner.nextLine();

        System.out.print("Введите конечную дату: ");
        String endDate = scanner.nextLine();

        findTransactionsByDate(dates, amounts, isTransfer, startDate, endDate);

        scanner.close();
    }

    public static void findTransactionsByDate(String[] dates, double[] amounts, boolean[] isTransfers, String startDate, String endDate) {
        System.out.println("Транзакции в диапазоне от " + startDate + " до " + endDate + ":");
        for (int i = 0; i < dates.length; i++) {
            if (dates[i].compareTo(startDate) >= 0 && dates[i].compareTo(endDate) <= 0) {
                System.out.println("Сумма: " + amounts[i] + ", Перевод: " + isTransfers[i] + ", Дата: " + dates[i]);
            }
        }
    }
}