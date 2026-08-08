import java.util.Scanner;

public class temparterurecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CELCIOUS OR FARANHITE: ");
        String tem = sc.nextLine();
        if (tem == "C" || tem == "c") {
            System.out.println("enter your tempareture: ");
            double jt = sc.nextDouble();
            double fahrenheit = (jt * 9.0 / 5.0) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("enter your temprateure: ");
            double ct = sc.nextDouble();
            double celsius = (ct - 32) * 5.0 / 9.0;
            System.out.println("Temperature in Celsius: " + celsius);
        }
        sc.close();
    }
}
