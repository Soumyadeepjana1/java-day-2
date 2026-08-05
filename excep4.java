public class excep4 {
    public static void main(String[] args) {
        try {
            int[] a = { 1, 2, 3, 4, 5, 6, 7, };
            System.out.println(a[12]);

        } catch (Exception e) {
            System.out.println("invaloid index");
        } finally {
            System.out.println("the program will be ended");
        }

    }
}
