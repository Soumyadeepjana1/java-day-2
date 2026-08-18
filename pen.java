class bollpen {
    String name;
    String type;
    double price;

    public void print_name(String name) {
        this.name = name;
        System.out.println("name of the bool pen is" + name);

    }

    public void print_info(String type, double price) {
        this.type = type;
        this.price = price;

        System.out.println("price of the pen is " + price);
        System.out.println("type of this pen is  " + type);

    }
}

public class pen {
    public static void main(String[] args) {
        bollpen p1 = new bollpen();
        p1.name = "link";
        p1.type = "ball";
        p1.price = 10;
        p1.print_info(p1.type, p1.price);
        p1.print_name(p1.name);
    }
}
