import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = sc.nextInt();
        if (age == 21)
            System.out.println("you are eligible for vote");
        else
            System.out.println("you are not eligible for vote");
        sc.close();
    }

}
