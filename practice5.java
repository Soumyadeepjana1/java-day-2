import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("find the largest number");
        System.out.println("enter 4 number one by one");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4)
            System.out.println("largest number is " + num1);
        else if (num2 > num1 && num2 > num3 && num2 > num4)
            System.out.println("largest number is " + num2);
        else if (num3 > num1 && num3 > num2 && num3 > num4)
            System.out.println("largest number is " + num3);
        else

            System.out.println("largest number is " + num4);
        sc.close();

    }

}
