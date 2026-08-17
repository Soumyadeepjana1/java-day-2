class student {
    String name;
    static String school_name;
}

public class statics {
    public static void main(String[] rags) {
        student.school_name = "bbhs";
        student s1 = new student();
        s1.name = "soumaydeep";
        System.out.println(s1.name);
        System.out.println(student.school_name);

        student s2 = new student();
        s2.name = "rinki";
        System.out.println(s2.name);
        System.out.println(student.school_name);

    }
}
