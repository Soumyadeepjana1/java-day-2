// import java.util.Arrays;

// public class array3 {
//     public static void main(String[] args) {
//         int[] age = new int[5];
//         age[0] = 21;
//         age[1] = 20;
//         age[2] = 30;
//         age[3] = 24;
//         age[4] = 18;
//         Arrays.sort(age);
//         System.out.println(age[0]);
//     }
// }
// import java.util.Arrays;

// public class array3 {
//     public static void main(String[] args) {
//         int[] marks = { 80, 92, 95, 88 };
//         System.out.println("all marks is" + Arrays.toString(marks));
//         System.out.println("length of marks is" + marks.length);

//     }
// }

// import java.util.Arrays;

// public class array3 {
//     public static void main(String[] args) {
//         int[] marks = { 12, 13, 16, 20 };
//         System.out.println("all marks is" + Arrays.toString(marks));
//         System.out.println("length of arrays is" + marks.length);
//     }
// }

import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        int[][] marks = { { 12, 13, 15, 16 }, { 16, 18, 15, 13 } };
        System.out.println("studen 1 marks is" + marks[1][2]);
        System.out.println("all arrays is " + Arrays.toString(marks[1]));
        System.out.println("first arrays is" + Arrays.toString(marks[0]));
    }

}