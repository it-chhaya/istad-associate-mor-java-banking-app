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

        SavingAccount mySavingAccount = new SavingAccount(BigDecimal.valueOf(5000));
        mySavingAccount.setAccountName("Stefen Ly");
        mySavingAccount.setAccountNumber("SA001");
        mySavingAccount.setCreateDate(LocalDate.of(2023, 1, 1));
        mySavingAccount.setInterestRate(7);
        mySavingAccount.setCard(card);

//        SavingAccount mySavingAccount = new SavingAccount(
//                "Stefen Ly",
//                "SA001",
//                5000.0,
//                LocalDate.of(2023, 1, 1),
//                7,
//                card
//        );

        do {
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
                case 1 -> mySavingAccount.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    mySavingAccount.deposit(BigDecimal.valueOf(amount));
                }
                case 3 -> {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    mySavingAccount.withdraw(BigDecimal.valueOf(amount));
                }
                case 0 -> System.exit(0);
            }
            System.out.println("-------------------");
        } while (true);


    }
}

