import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your pass word: ");
        int pass = 123456789;

        do {
            pass = sc.nextInt();
            System.out.println("pass word is : *********");

            if (pass == 123456789) {
                System.out.println("login succesfull");
            } else {
                System.out.println("worng pass word : plese re type the pass word: ");
            }
        } while (pass != 123456789);

        sc.close();

    }
}