import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000;

        System.out.print("Enter PIN: ");
        int userPin = sc.nextInt();

        if (userPin == pin) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance = ₹" + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Deposit Successful");
                System.out.println("Balance = ₹" + balance);
            } else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Balance = ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
            } else {
                System.out.println("Invalid Choice");
            }

        } else {
            System.out.println("Incorrect PIN");
        }

        sc.close();
    }
}
