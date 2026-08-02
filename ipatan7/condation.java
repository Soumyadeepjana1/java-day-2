import java.util.Scanner;

public class condation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current KM: ");
        int currentKM = scanner.nextInt();

        System.out.print("Enter last service KM: ");
        int lastServiceKm = scanner.nextInt();

        System.out.print("Enter service interval: ");
        int interval = scanner.nextInt();

        int kmSinceLastService = currentKM - lastServiceKm;

        if (kmSinceLastService < 0) {
            System.out.println("invalid data");
        } else if (kmSinceLastService > interval) {
            System.out.println("Overdue");

        } else if (kmSinceLastService < interval - 1_000) {
            System.out.println("Due_Soon");

        } else {
            System.out.println("OK");
        }

    }

}
