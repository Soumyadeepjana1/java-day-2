class student {
    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class constractor {
    public static void main(String[] args) {
        student s1 = new student("soumyadeep", 22);
        System.out.println(s1.name);
        System.out.println(s1.age);

    }
}
