class me {
    String name;
    int age;
    String location;
    String collage;

    public void print_name() {
        System.out.println(this.name);
        System.out.println(this.name);
    }

    public void print_age() {
        System.out.println(this.age);
    }

    public void print_location() {
        System.out.println(this.location);
    }

    public void print_collage() {
        System.out.println(this.collage);
    }
}

class cobra {
    String name;
    String location;

    public void print_name() {
        System.out.println(this.name);

    }

    public void print_location() {
        System.out.println(this.location);
    }

}

public class class3 {
    public static void main(String[] args) {
        me sou = new me();
        sou.name = "soumyadeep";
        sou.age = 22;
        sou.location = "paschim medinipur";
        sou.collage = "chandigarh university";

        cobra hello = new cobra();
        hello.name = "king cobra";
        hello.location = "jungle";

        sou.print_name();
        sou.print_age();
        sou.print_location();
        sou.print_collage();

        hello.print_name();
        hello.print_location();
    }
}
