// public class operators2 {
//     public static void main(String[] args) {
//         int name = 1;
//         name++;
//         name++;
//         System.out.println(name);

//     }
// }
// import java.util.Scanner;

// public class operators2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter user input: ");
//         int a = sc.nextInt();
//         System.out.println(+a);
//         System.out.println("enter a  boolean value: ");
//         boolean name = sc.nextBoolean();
//         System.out.println(!name);
//         sc.close();

//     }
// }

// import java.util.Scanner;

// public class operators2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a integer value: ");
//         int value = sc.nextInt();
//         System.out.println(++value);
//         sc.close();

//     }
// }12

import java.util.Scanner;

public class operators2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first value:");
        int age = sc.nextInt();
        System.out.println("enter 2nd value: ");
        int value = sc.nextInt();
        System.out.println(age + value);

        float name = sc.nextFloat();
        System.out.println(name);
        System.out.println("enter your name");
        String lok = sc.next();
        System.out.println(lok);
        System.out.println("enter a full word");
        String lc = sc.nextLine();
        System.out.println(lc);

        sc.close();
    }
}