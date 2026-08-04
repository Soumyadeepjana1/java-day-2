public class exception {
    public static void main(String[] args) {
        int[] marks = { 1, 23, 5, 67, 89 };
        try {
            System.out.println(marks[2]);
        } catch (Exception e) {
            System.out.println("this marks is not avalable");
        }

        System.out.println("end the program");

    }
}
