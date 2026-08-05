import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----SBI BANK-----");
        System.out.println("enter your ac number: ");
        int l = sc.nextInt();
        System.out.println("enter your pin number: ");
        int n = sc.nextInt();
        try {
            System.out.println("invalid ac number or pin:");

        } catch (Exception e) {
            if (l == 123456789) {
                if (n == 7872) {
                    System.out.println("your name is soumyadeep");
                    System.out.println("your acnumber is : " + l);

                    int b = sc.nextInt();
                    System.out.println("your ballance is:" + b);
                } else
                    System.out.println("invalid user: ");

            }

        } finally {
            System.out.println("thanks for use our services");

        }
        sc.close();

    }
}