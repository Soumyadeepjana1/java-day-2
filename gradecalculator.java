import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = sc.nextInt();

        if (marks >= 95 && marks == 100) {
            System.out.println("A+");
        } else if (marks >= 90 && marks <= 95) {
            System.out.println("A");

        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");

        } else if (marks >= 0) {
            System.out.println("F");
        } else {
            System.out.println("invalid marks");
        }
        sc.close();
    }
}