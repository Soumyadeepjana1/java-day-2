public class forloop6 {
    public static void main(String[] args) {

        int n = 0;

        for (int i = n; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}