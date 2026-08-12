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
}

public class gass {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.brand = "cello";
        // System.out.println(pen1.colour);
        // System.out.println(pen1.brand);

        pen pen2 = new pen();
        pen2.print_colour();

        pen1.add();
    }
}
