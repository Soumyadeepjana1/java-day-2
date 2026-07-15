import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b > 0) {
            a++;
            b--;
        }
        System.out.println(a);
        sc.close();
    }

}
