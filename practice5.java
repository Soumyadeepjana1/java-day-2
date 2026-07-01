public class practice5 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 4;
        int num4 = 3;
        if (num1 > num2 && num1 > num3 && num1 > num4)
            System.out.println("largest number is " + num1);
        else if (num2 > num1 && num2 > num3 && num2 > num4)
            System.out.println("largest number is " + num2);
        else if (num3 > num1 && num3 > num2 && num3 > num4)
            System.out.println("largest number is " + num3);
        else
            System.out.println("largest number is " + num4);
    }
}
