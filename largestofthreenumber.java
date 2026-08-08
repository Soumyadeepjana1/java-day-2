public class largestofthreenumber {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 23;
        int num3 = 12;
        if (num1 > num2 && num1 > num3) {
            System.out.println("number 1 is big");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("number 2 is big");
        } else {
            System.out.println("number 3 is big");
        }
    }
}
