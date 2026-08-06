public class exception {
    public static void main(String[] args) {
        String[] marks = { "i", "k", "u", "b", "l" };
        try {
            System.out.println(marks[8]);
        } catch (Exception e) {
            System.out.println("this marks is not avalable");
        } finally {
            System.out.println("end the program");
        }
    }
}
