import java.util.Scanner;

public class cb {
    public static void mai(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value: ");

        int i = sc.nextInt();

        while (true) {
            if (i >= 10) {
                System.out.println(i);
                i++;
            } else if (i == 5) {
                continue;
            } else {
                break;
            }
            sc.close();
        }
    }
}
