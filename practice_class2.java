class student {
    String name;
    int age;

    public void add() {
        System.out.println("name of the studen is: ");
    }

    public void print_name() {
        System.out.println(this.name);
    }

    public void print_age() {
        System.out.println(this.age);
    }
}

public class practice_class2 {
    public static void main(String[] args) {
        student mm = new student();
        mm.name = "soumyadeep";
        mm.age = 22;

        student m2 = new student();
        m2.name = "abcd";
        m2.age = 21;

        mm.print_name();
        mm.print_age();

        m2.print_name();
        m2.print_age();
    }
}
