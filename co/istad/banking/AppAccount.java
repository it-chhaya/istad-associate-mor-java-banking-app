package practice.co.istad.banking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class AppAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Card card = new Card(
                "1234",
                LocalDate.of(2028, 1, 1),
                BigDecimal.valueOf(5000),
                "MASTERCARD"
        );

        Account account;

        do {
            System.out.println("Process transaction");
            System.out.println("1. Saving");
            System.out.println("2. Payroll");
            System.out.print("Enter option: ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1 -> account = new SavingAccount(
                        "CHAN CHHAYA",
                        "99990000",
                        BigDecimal.valueOf(5000),
                        LocalDate.of(2023,1,1),
                        10,
                        card
                );
                case 2 -> account  = new PayrollAccount(
                        "CHAN CHHAYA",
                        "99990000",
                        BigDecimal.valueOf(5000),
                        LocalDate.of(2023,1,1),
                        10,
                        card
                );
                default -> throw new IllegalStateException();
            }

            System.out.println("Welcome to bank app");
            System.out.println("-------------------");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("0. Exit");
            System.out.println("-------------------");
            System.out.print("Enter option:");
            int option = Integer.parseInt(scanner.nextLine());
            System.out.println("-------------------");
            switch (option){
                case 1 -> account.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    account.deposit(BigDecimal.valueOf(amount));
                }
                case 3 -> {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    account.withdraw(BigDecimal.valueOf(amount));
                }
                case 0 -> System.exit(0);
            }
            System.out.println("-------------------");
        } while (true);


    }
}

