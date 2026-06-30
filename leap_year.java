import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year to check leap yer or not");
        int year = sc.nextInt();
        if (year % 400 == 0)
            System.out.println("year is leep year");
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println("year is leap year");
        else
            System.out.println("number is not leap year");
        sc.close();

    }
}
