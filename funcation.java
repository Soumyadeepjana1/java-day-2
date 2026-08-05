import java.util.Scanner;

public class funcation {
    public static void printage(int age) {
        System.out.println("age is :" + age);
        if (age >= 18) {
            System.out.println("you are eligiblefor votting");
        } else {
            System.out.println("you are not eligible for votting");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int ag = sc.nextInt();
        printage(ag);
        sc.close();
    }
}
