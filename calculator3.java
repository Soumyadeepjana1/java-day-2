import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your firs number:");
        int num1 = sc.nextInt();
        System.out.println("enter operation: ");
        char opration = sc.next().charAt(0);
        System.out.println("enter 2nd number: ");
        int num2 = sc.nextInt();

        switch (opration) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                break;
        }
        sc.close();

    }
}
