import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value to see number is odd orr even ");
        int value = sc.nextInt();
        if (value % 2 == 0)
            System.out.println("number is even ");
        else
            System.out.println("number is odd");
    }

}
