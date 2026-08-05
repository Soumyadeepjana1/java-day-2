import java.util.Scanner;

public class excp1 {
    public static void main(String[] args) {
        int[] value = { 1, 23, 34, 45, 56, 7, 8 };
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter your value index:");
            int v = sc.nextInt();
            System.out.println(value[v]);
            sc.close();

        } catch (Exception e) {
            System.out.println("invalid index print right index");
        } finally {
            System.out.println("end of the program ");
        }

    }
}
