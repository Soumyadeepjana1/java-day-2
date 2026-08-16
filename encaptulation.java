class BankAccount {
    private double balance;

    // Setter — controlled ভাবে data set করার জন্য
    public void deposit(double amount) {
        if (amount > 0) { // নিয়ম বসানো যায়!
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Getter — controlled ভাবে data পড়ার জন্য
    public double getBalance() {
        return balance;
    }
}

public class encaptulation {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();

        // a1.balance = -5000; // ❌ এটা করা যাবে না! balance private
        a1.deposit(-100); // ✅ শুধু deposit method দিয়েই balance পরিবর্তন করা যাবে
        a1.deposit(-500); // ❌ "Invalid amount" — আমাদের বসানো নিয়ম কাজ করছে

        System.out.println(a1.getBalance()); // ✅ getter দিয়ে পড়া যাচ্ছে
    }
}
