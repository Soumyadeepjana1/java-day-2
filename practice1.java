import java.util.Arrays;
public class practice1 {
    public static void main(String[] args){
        int[] marks = new int[5];
        marks[0] = 75;
        marks[1] = 13;
        marks[2] = 45;
        marks[3] = 56;

        Arrays.sort(marks);
        System.out.println(marks[3]);
        System.out.println(marks.length);
        System.out.println(marks[2]);
    }
    
}