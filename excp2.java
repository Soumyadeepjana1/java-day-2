import java.util.Scanner;

public class excp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter firs value: ");
        int a = sc.nextInt();
        System.out.println("enter 2 nd value: ");
        int b = sc.nextInt();
        try {
            int d = a / b;
            System.out.println("division of two numbers is: " + d);
        } catch (ArithmeticException e) {
            System.out.println("invalid input: cannot divide by 0");
        } finally {
            System.out.println("end of this program");
        }
        sc.close();
    }
}

// Question 2 (Easy–Medium) ⭐⭐

// একটি Java program লেখো যেখানে:

// User থেকে দুটি integer input নেবে।
// প্রথম সংখ্যাকে দ্বিতীয় সংখ্যা দিয়ে divide করবে।
// যদি user 0 দেয়, তাহলে ArithmeticException handle করবে।
// সবশেষে সবসময় print করবে: