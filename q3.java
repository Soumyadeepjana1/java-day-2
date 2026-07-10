public class q3 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int ro = 10; ro >= 1; ro--) {
            for (int cl = 1; cl <= ro; cl++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
