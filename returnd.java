public class returnd {
    public static int printsum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int c = printsum(12, 34);
        System.out.println(c);
        System.out.println(c * 3);
    }
}
