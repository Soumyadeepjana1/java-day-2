class bank {
    private double balance;

    public void balance_check(double ammount) {
        if (ammount >= 0) {
            balance = balance + ammount;
        } else {
            System.out.println("invalid balance ");
        }
    }

    public double show_ballance() {
        return balance;
    }
}

public class encaptule {
    public static void main(String[] args) {
        bank b1 = new bank();
        b1.balance_check(100000);
        System.out.println(b1.show_ballance());

        bank b2 = new bank();
        b2.balance_check(-1000);
        System.out.println(b2.show_ballance());

        bank b3 = new bank();
        b3.balance_check(100);
        System.out.println(b3.show_ballance());

        bank b4 = new bank();
        b4.balance_check(10000);
        System.out.println(b4.show_ballance());

    }
}
