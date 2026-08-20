
// Create a BankAccount class using Encapsulation.

// Requirements:

// Create private variables: accountHolder, accountNumber, balance.
// Create Getter and Setter for all variables.
// balance cannot be negative.
// Create a method deposit() to add money.
// Create a method withdraw() to withdraw money.
// Withdrawal should not be allowed if the balance is insufficient.
// Create a main() method and test the class

class bankaccount {
    private String acholder;
    private int acnumber;
    private int ballance;

    // get
    public void set(String acholder) {
        this.acholder = acholder;
    }

    public void set(int acnumber) {
        this.acnumber = acnumber;
    }

    public void set_ballance(int ballance) {
        if (ballance >= 0) {
            this.ballance = ballance;
            System.out.println("number is valid " + ballance);
        } else {
            System.out.println("number is not valid");
        }
    }

    public String get() {
        return acholder;
    }

    public int get_acnumber() {
        return acnumber;
    }

    public int get_ballance() {
        return ballance;
    }

    public void deposit(int ammount) {
        if (ammount > 0) {
            ballance = ballance + ammount;
        } else {
            System.out.println("invalid ammount");
        }

    }

    public void withdrow(int ammount) {
        if (ammount > 0 && ammount <= ballance) {
            ballance = ballance - ammount;
        } else {
            System.out.println("invalid ammount");
        }
    }

}

public class project5 {
    public static void main(String[] args) {
        bankaccount b1 = new bankaccount();
        b1.set("Soumyadeep");
        b1.set_ballance(1000000000);
        b1.set(123455678);
        b1.deposit(500);

        System.out.println(b1.get());
        System.out.println(b1.get_acnumber());
        System.out.println(b1.get_ballance());
        b1.withdrow(100);
        System.out.println(b1.get_ballance());

        bankaccount b2 = new bankaccount();
        b2.set("cobra");
        b2.set(1233443454);
        b2.set_ballance(-10000);
        b2.deposit(1000);

        System.out.println(b2.get());
        System.out.println(b2.get_acnumber());
        System.out.println(b2.get_ballance());

        b2.withdrow(500);
        System.out.println(b2.get_ballance());

    }
}
