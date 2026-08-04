import java.util.Scanner;

public class lpg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value: ");

        int i = sc.nextInt();
        sc.close();

        while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
