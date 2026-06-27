import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // calculator part
        System.out.println("welcome to jana calculator");
        // addition
        System.out.println("enter first number:");
        int b = sc.nextInt();
        System.out.println("enetr 2nd number: ");
        int a = sc.nextInt();
        System.out.println("addition of two number is");
        int sum = b + a;
        System.out.println(sum);

        // subtraction
        System.out.println("enter first number: ");
        int c = sc.nextInt();
        System.out.println("enter 2nd number: ");
        int d = sc.nextInt();
        System.out.println("subtraction of two number is:");
        int sub = c - d;
        System.out.println(sub);

        // multipication
        System.out.println("enter first number ");
        int e = sc.nextInt();
        System.out.println("enter 2nd number");
        int f = sc.nextInt();
        System.out.println("multipication of two number is: ");
        int multi = e * f;
        System.out.println(multi);

        // devison
        System.out.println("enter first number ");
        int g = sc.nextInt();
        System.out.println("enter 2nd number ");
        int h = sc.nextInt();
        System.out.println("divison of two number is");
        int div = g % h;
        System.out.println(div);

        sc.close();

    }

}
