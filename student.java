class stu {
    String name;
    int age;

    public void print_info() {
        System.out.println(name + " " + age);
    }

    stu(String name, int age) {
        System.out.println("constructor 1 is called");
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }

    stu() {
        System.out.println("constructor 2 is called");
    }

    stu(stu s3) {
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class student {
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.name = "Soumyadeep";
        s1.age = 21;

        s1.print_info();

        stu s2 = new stu();
        s2.name = "cobra";
        s2.age = 22;
        s2.print_info();

        stu s3 = new stu("king", 23);
        s3.print_info();

        stu s4 = new stu(s1);
        s4.print_info();

    }
}
