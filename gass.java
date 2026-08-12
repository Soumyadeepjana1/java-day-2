class pen {
    String colour;
    String brand;

    public void add() {
        System.out.println(this.colour);
        System.out.println(this.brand);
    }

    public void print_colour() {
        System.out.println(this.colour);
    }

    pen() {
        System.out.println("constructor called for pen");
    }
}

class student {
    String name;
    String age;

    public void print_name() {
        System.out.println(this.name);

    }

    public void print_age() {
        System.out.println(this.age);

    }

    student() {
        System.out.println("constructor called for student");
    }
}

class car {
    String model;
    String price;

    public void print_car() {
        System.out.println(this.model);
        System.out.println(this.price);
    }

    car(String model, String price) {
        this.model = model;
        this.price = price;
    }
}

public class gass {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.brand = "cello";
        // System.out.println(pen1.colour);
        // System.out.println(pen1.brand);

        student s1 = new student();
        s1.name = "Soumyadeep jana";
        s1.age = "22";

        pen pen2 = new pen();
        pen2.colour = "red";
        pen2.print_colour();

        pen1.add();

        s1.print_name();
        s1.print_age();

        student s2 = new student();
        s2.name = "don";
        s2.age = "23";
        s2.print_name();
        s2.print_age();

        car car1 = new car("BMW", "2cr");
        car1.print_car();

    }
}
