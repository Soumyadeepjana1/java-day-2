import java.util.Scanner;

public class excep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value");
        int a = sc.nextInt();
        System.out.println("enter 2nd value");
        int b = sc.nextInt();
        try {
            int r = a / b;
            System.out.println("division is: " + r);
        } catch (ArithmeticException e) {
            System.out.println("division is not possible");
            System.out.println("invalid input: cannot divide by 0");
        } finally {
            System.out.println("done this program");
        }
        sc.close();
    }

}
