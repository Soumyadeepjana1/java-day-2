public class ford8 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 15; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println((double) sum / 15);
    }

}
