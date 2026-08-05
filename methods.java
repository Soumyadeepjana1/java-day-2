public class methods {
    static void joh() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        joh();

        int i = 1;
        while (i <= 10) {

            System.out.print(i + "  ");
            joh();
            i++;
        }
    }
}
