import java.util.Scanner;

public class blood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("blood donation camp");
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your weight");
        int weight = sc.nextInt();
        if (age >= 21 && weight >= 55)
            System.out.println(name + " you can eligible for blood donation camp");
        else if (age >= 21 && weight < 55)
            System.out.println(name + " you are not eligible for blood donation camp");
        else if (age < 21 && weight >= 55)
            System.out.println(name + " you are not eligible for blood donation came ");
        else
            System.out.println(name + " you are not eligible for blood donation camp");
        sc.close();
    }
}
