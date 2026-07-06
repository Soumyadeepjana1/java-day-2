import java.util.Scanner;

public class jtx {
    public static void main(String[] args) {
        System.out.println("plese enter your colour");
        Scanner sc = new Scanner(System.in);
        String colour = sc.next();

        switch (colour) {
            case "red":
                System.out.println("plese stop");
                break;
            case "yellow":
                System.out.println("ready");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("invalid colour");
        }

        sc.close();

    }

}
