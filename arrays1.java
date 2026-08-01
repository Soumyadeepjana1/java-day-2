import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        int[] number = new int[10];
        String[] name = new String[10];
        char[] ch = new char[10];

        ch[0] = 'a';
        ch[1] = 'b';
        ch[2] = 'c';
        ch[3] = 'd';
        ch[4] = 'e';
        ch[5] = 'f';
        ch[6] = 'g';
        ch[7] = 'h';
        ch[8] = 'i';
        ch[9] = 'j';

        name[0] = "soumyadeep";
        name[1] = "kushi";
        name[3] = "tanu";

        number[0] = 1;
        number[1] = 2;
        number[3] = 3;
        number[2] = 4;

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[3]);
        System.out.println(number[2]);

        System.out.println(number.length);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[3]);

        System.out.println(name.length);

        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[4]);
        System.out.println(ch[3]);
        System.out.println(ch.length);

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

    }

}