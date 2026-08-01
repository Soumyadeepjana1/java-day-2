import java.util.Scanner;

public class constant2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = sc.nextInt();
        System.out.println("number is " + a);
        int num = 12;
        num = 34;
        final int b = 36; // constant (using final key word)

        System.out.println(num);
        System.out.println(b);
        sc.close();
    }
}
