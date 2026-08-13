class Student {
    String name;
    int age;

    // Normal (parameterized) constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

class school {
    String name;
    int age;

    school(Student s3) {
        System.out.println("this is for schhol constructor");
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Soumyadeep", 22);
        Student s2 = new Student(s1); // ⬅️ s1 থেকে copy করে s2 বানানো হলো

        System.out.println(s2.name); // Soumyadeep
        System.out.println(s2.age); // 22

        school s4 = new school(s2);
        System.out.println(s4.name);
        System.out.println(s4.age);

        Student s5 = new Student(s2);
        System.out.println(s5.name);
        System.out.println(s5.age);

    }
}
