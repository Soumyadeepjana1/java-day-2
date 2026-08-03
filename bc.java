public class bc {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println("print number" + i);
            i++;
            if (i >= 10) {
                break;

            } else if (i == 5) {
                i++;
                continue;
            }
        }
    }
}