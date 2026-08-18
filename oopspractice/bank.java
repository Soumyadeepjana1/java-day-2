package oopspractice;

class BankAccount {
    private int acNumber;
    private String acHolderName;
    private double balance;

    public void setAcNumber(int acNumber) {
        if (acNumber <= 0) {
            System.out.println("wrong Account Number!");
            return;
        }
        this.acNumber = acNumber;
    }

    public int getAcNumber() {
        return acNumber;
    }

    public String getAcHolderName() {
        return acHolderName;
    }

    public void setAcHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("wrong Balance!");
            return;
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double depositAmount(double amount) {
        if (amount >= 0) {
            this.balance += amount; // যোগ হচ্ছে, replace নয়
            System.out.println("deposit successfully");
            return amount;
        } else {
            System.out.println("invalid deposit");
            return 0;
        }
    }

    public double withdrawAmount(double amount) {
        if (amount <= this.balance && amount >= 0) {
            this.balance -= amount; // বিয়োগ হচ্ছে
            System.out.println("withdraw successfully");
            return amount;
        } else {
            System.out.println("invalid withdraw");
            return 0;
        }
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAcHolderName("soumyadeep");
        b1.setAcNumber(123);
        b1.setBalance(10000);

        System.out.println(b1.getAcNumber());
        System.out.println(b1.getBalance());
        System.out.println(b1.getAcHolderName());

        System.out.println(b1.depositAmount(5000));
        System.out.println("Balance after deposit: " + b1.getBalance());

        System.out.println(b1.withdrawAmount(3000));
        System.out.println("Balance after withdraw: " + b1.getBalance());
    }
}