import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        System.out.println("welcome to SBI BANK Atm");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 3) {
            System.out.println("which facility you want to use:");
            System.out.println("1.check ballance");
            System.out.println("2.deposit mony");
            System.out.println("3.withdrow mony");
            System.out.println("4.pin verification");
            System.out.println("5.forget pin");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
            System.out.println("add your ballance");
            int ballance = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("your choice is 1check ballance");
                    System.out.println("your ballance is:" + ballance);
                    System.out.println("----------------------------------");
                    break;
                case 2:
                    System.out.println("your choice is 2 deposit mony");
                    System.out.println("enter your deposit mony: ");
                    int deposit = sc.nextInt();
                    ballance = ballance + deposit;
                    System.out.println("your deposit ballance is:" + ballance);
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    System.out.println("your choice is 3 withdrow mony");
                    System.out.println("enter your withdrow mony: ");
                    int withdrow = sc.nextInt();
                    if (withdrow <= ballance) {
                        System.out.println("your withdrow is succesfull");
                        ballance = ballance - withdrow;
                        System.out.println("your current ballance is :" + ballance);

                    } else {
                        System.out.println("your withdrow is unsuccesfull");
                        System.out.println("your current ballance is :" + ballance);
                        System.out.println("you need to add more mony");
                    }
                    System.out.println("----------------------------------");
                    break;
                case 4:
                    System.out.println("your choic is pin verification");
                    System.out.println("enter your pin");
                    int pin = sc.nextInt();
                    if (pin == 1234) {
                        System.out.println("your pin is coreerct");
                        System.out.println("AC holder name is : SOUMYADEEP JANA THE LEDGENT");

                    } else {
                        System.out.println("your pin isin correct");
                    }
                    System.out.println("----------------------------------");
                    break;
                case 5:
                    System.out.println("your choic is forget pin");
                    System.out.println("enter your new pin");
                    int newpin = sc.nextInt();
                    System.out.println("your new pin is:" + newpin);
                    System.out.println("----------------------------------");
                    break;
                default:
                    System.out.println("invalid choice");
                    System.out.println("----------------------------------");
            }
            i++;

        }
        sc.close();

    }
}
