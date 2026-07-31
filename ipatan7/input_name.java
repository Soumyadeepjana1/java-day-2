import java.util.Scanner;

public class variable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name ");

        String name = scanner.nextLine();

        System.out.println("your name is: " + name);
        scanner.close();

    }

}