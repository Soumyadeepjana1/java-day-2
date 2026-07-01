import java.util.Scanner;

public class employ {
    public static void main(String[] args) {
        System.out.println("employ sallary details");
        Scanner sc = new Scanner(System.in);
        System.out.println("employ list");
        System.out.println("employ 1");
        int employ1 = sc.nextInt();
        System.out.println("employ 2");
        int employ2 = sc.nextInt();
        System.out.println("employ 3");
        int employ3 = sc.nextInt();
        System.out.println("employ 4");
        int employ4 = sc.nextInt();
        if (employ1 > employ2 && employ1 > employ3 && employ1 > employ4)
            System.out.println("employ1 is high sallary");
        else if (employ2 > employ1 && employ2 > employ3 && employ2 > employ4)
            System.out.println("employ 2 is high sallary");
        else if (employ3 > employ1 && employ3 > employ2 && employ3 > employ4)
            System.out.println("employ 3 is higher sallary");
        else
            System.out.println("employ 4 is high sallary");
        sc.close();
    }

}
