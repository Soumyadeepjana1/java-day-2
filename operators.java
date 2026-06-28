import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        double aa = 5;
        double bb = 2;
        double ab = 5 % 2;
        int a = sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("addition of two number is: " + sum);
        System.out.println(ab);

        double c = 12;
        double d = 13;
        double cd = c * d;
        System.out.println(cd);

        double e = 12;
        double f = 17;
        double ef = e / f;
        System.out.println(ef);

        sc.close();

    }

}
