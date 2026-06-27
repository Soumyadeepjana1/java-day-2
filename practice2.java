// public class practice2 {
//     public static void main(String[] args) {
//         double age = 300.5;
//         final String name = "soumyadeep";
//         int age1 = (int) age;
//         System.out.println(age);
//         System.out.println(age1);
//         System.out.println(name);
//     }
// }

// public class practice2 {
//     public static void main(String[] args) {
//         double age = 300.5;
//         final String name = "soumyadeep";
//         int age1 = (int) age;
//         System.out.println(age);
//         System.out.println(age1);
//         System.out.println(name);
//     }
// }
import java.util.Arrays;

public class practice2 {
    public static void main(String[] args) {
        int[] name = { 12, 14, 15, 16 };
        double name1 = 12.5;
        int[][] friends = { { 16, 19, 13, 19 }, { 12, 9, 17, 14, 16 } };
        int value1 = 12;
        int value2 = 13;
        int no = (int) name1;
        System.out.println("print " + name.length);
        Arrays.sort(name);
        System.out.println(name[3]);
        System.out.println("print" + name[0]);
        System.out.println(friends[0][3]);
        System.out.println(friends.length);
        System.out.println("print" + no);
        System.out.println("plus of two number is : " + (value1 + value2));
    }
}