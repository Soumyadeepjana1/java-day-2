public class except {
    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 0;
            System.out.println(a / b);
            ;
        } catch (ArithmeticException e) {
            System.out.println("can not devide by 0 in java");
        }

        System.out.println("program end");
    }

}
