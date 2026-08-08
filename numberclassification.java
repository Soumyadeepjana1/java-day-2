import java.util.Scanner;

public class numberclassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check number is even or odd or not");
        int number = sc.nextInt();
        if (number >= 0) {
            if (number % 2 == 0) {
                System.out.println("number is is even and posetive");
            } else {
                System.out.println("number is odd and posetive");
            }
        } else {
            System.out.println("number is negative");
        }
        sc.close();
    }
}
