class book {
    String type;
    String name;

    public void write() {
        System.out.println("write something for this book ");
    }

    public void print_type() {
        System.out.println(this.type);

    }

    public void print_name() {
        System.out.println(this.name);
    }
}

class pen {
    String name;
    String type;

    public void write() {
        System.out.println("print about this pen");

    }

    public void print_name() {
        System.out.println(this.name);

    }

    public void print_type() {
        System.out.println(this.type);
    }
}

public class class2 {
    public static void main(String[] args) {
        book book1 = new book();
        book1.type = "devops book";
        book1.name = "learning devops";

        book book2 = new book();
        book2.type = "java book";
        book2.name = "learning java";

        pen pen1 = new pen();
        pen1.type = "gel";
        pen1.name = "elkos";

        pen1.write();
        pen1.print_name();
        pen1.print_type();

        book1.write();
        book2.write();

        book1.print_type();
        book1.print_type();
        book2.print_type();

        book1.print_name();
        book2.print_name();
    }

}
