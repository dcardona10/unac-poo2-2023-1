import java.util.Scanner;
import java.util.UUID;

import co.edu.unac.poo2.cl01.Account;
import co.edu.unac.poo2.cl01.User;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int option;
        User user = new User();
        Account account = new Account();
        double amount;

        do {
            System.out.println("*****UNACBANK*****");
            System.out.println("1. Create User");
            System.out.println("2. Create Account");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("0. Exit");
            option = scan.nextInt();
            switch(option) {
                case 1:
                    System.out.println("ID:");
                    String id = scan.next();
                    System.out.println("Name:");
                    String name = scan.next();
                    System.out.println("Address");
                    String address = scan.next();
                    System.out.println("Phone Number:");
                    String phone = scan.next();
                    user = new User(id, name, address, phone);
                    break;
                case 2:
                    String accountNumber = UUID.randomUUID().toString();
                    System.out.println("Type:");
                    char type = scan.next().charAt(0);
                    System.out.println("Balance:");
                    double balance = scan.nextDouble();
                    account = new Account(accountNumber, user, type, balance);
                    break;
                case 3:
                    System.out.print("Amount to withdraw:");
                    amount = scan.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                    System.out.print("Amount to deposit:");
                    amount = scan.nextDouble();
                    account.deposit(amount);
                    break;
            }
        } while (option != 0);
    }
}