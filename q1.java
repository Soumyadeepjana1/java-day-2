public class q1 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int clum = 1; clum <= row; clum++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
