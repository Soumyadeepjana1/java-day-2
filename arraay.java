import java.util.Arrays;

public class arraay {
    public static void main(String[] args) {
        int geo = 97;
        int eng = 99;
        int beng = 98;
        int history = 92;
        int[] marks = new int[4];
        marks[0] = 97;
        marks[1] = 92;
        marks[2] = 93;
        marks[3] = 99;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        System.out.println(geo);
        System.out.println(eng);
        System.out.println(beng);
        System.out.println(history);

        // arry length funcation

        System.out.println(marks.length);

        // arry sort method

        Arrays.sort(marks);
        System.out.println(marks[3]);
    }
}