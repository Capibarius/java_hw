package ru.netology.losev;
import java.util.Scanner;


public class HW_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int transactionCount = 0;

        while (true) {
            transactionCount++;

            System.out.print("Введите сумму транзакции: ");
            double income = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Транзакция является переводом? (true/false): ");
            boolean transfer = scanner.nextBoolean();
            scanner.nextLine();

            System.out.print("Введите дату транзакции: ");
            String date = scanner.nextLine();

            System.out.println("Данные о " + transactionCount + " транзакции: " + income + ", " + transfer + ", " + date);
            System.out.println();

            if (transactionCount >= 5) {
                break;
            }
        }
        scanner.close();
    }
}

