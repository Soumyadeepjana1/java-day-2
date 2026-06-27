// import java.util.Scanner;
// public class calculator {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your name ");
//         int number = sc.nextInt();
//         System.out.println(number);
//         sc.close();
//     }
// }

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("eneter your 2 nd number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("total sum is");
        System.out.println(sum);

        // calculator:
        System.out.println("type operation");
        System.out.println("enter new number");
        int c = sc.nextInt();
        System.out.println("enter 2nd new number:");
        int d = sc.nextInt();
        System.out.println("multipication of two number is");
        int multi = c * d;
        System.out.println(multi);
        sc.close();

    }
}