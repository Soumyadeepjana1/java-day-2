import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value to check number is posetive negative or nutral:  ....");
        int number = sc.nextInt();
        if (number > 0)
            System.out.println("number is posetive");
        else if (number < 0)
            System.out.println("number is negetive");
        else
            System.out.println("number is 0 ");
        sc.close();

    }

}
