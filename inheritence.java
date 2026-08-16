class car {
    String colour;
    String model;
}

class gari extends car {
    String name;
    int price;

    public void print_info() {
        System.out.println("the name of the car is " + name);
        System.out.println("colour is " + colour);
        System.out.println("model is " + model);
        System.out.println("price is " + price);
    }
}

public class inheritence {
    public static void main(String[] args) {
        gari g1 = new gari();
        g1.name = "BMW";
        g1.colour = "blue";
        g1.model = "X5";
        g1.price = 3000000;

        System.out.println("the name of the car is " + g1.name);
        System.out.println("the colour of the car is " + g1.colour);
        System.out.println("the price of the car is " + g1.price);

        g1.print_info();
    }
}
