class pen {
    String colour;
    String type;

    public void write() {
        System.out.println("write something for this pen");
    }

    public void print_colour() {
        System.out.println(this.colour);
    }

    public void print_type() {
        System.out.println(this.type);
    }
}

class student {
    String name;
    String subject;
    int age;
    int roll;

    public void write() {
        System.out.println("enter studen details:");
    }

    public void print_name() {
        System.out.print(this.name);
    }

    public void print_subject() {
        System.out.println(this.subject);

    }

    public void print_age() {
        System.out.println(this.age);
    }

    public void print_roll() {
        System.out.println(this.roll);
    }

}

public class oops1st {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "red";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.colour = "black";
        pen2.type = "use and through";

        student student1 = new student();
        student1.age = 21;
        student1.name = "soumyadeep";
        student1.roll = 22;
        student1.subject = "MCA";

        pen1.write();
        pen1.print_colour();
        pen1.print_type();

        pen2.write();
        pen2.print_colour();
        pen2.print_type();

        student1.write();
        student1.print_name();
        student1.print_age();
        student1.print_roll();
        student1.print_subject();
    }

}
