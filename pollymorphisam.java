//same funcation work different wayes

class student {

    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print_info(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void print_info(String name) {
        System.out.println(name);
    }

    public void print_info(int age) {
        System.out.println(age);
    }

}

public class pollymorphisam {
    public static void main(String[] args) {
        student s1 = new student("soumyadeep", 22);
        s1.print_info(s1.name, s1.age);
        s1.print_info(s1.name);
        s1.print_info(s1.age);
    }

}
