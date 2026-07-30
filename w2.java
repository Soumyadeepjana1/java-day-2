import java.util.Scanner;

public class w2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("enter your input ");
            num = sc.nextInt();
            System.out.print("here the number is ");
            System.out.println(num);
        } while (num >= 0);
        System.out.println("the end ");
        sc.close();
    }

}
