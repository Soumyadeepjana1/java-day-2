import java.util.Scanner;

public class swwitch {
    public static void main(String[] args) {
        // switch case:
        Scanner sc = new Scanner(System.in);
        System.out.println("print your day ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("print its monday");
                break;
            case 2:
                System.out.println("its twiesday");
                break;
            case 3:
                System.out.println("weed");
                break;
            case 4:
                System.out.println("thus");
                break;
            case 5:
                System.out.println("fri");
                break;
            default:
                System.out.println("its sunday");
        }

        sc.close();
    }

}
