class car {
    String brand = "bmw";
    int price = 100000;

    public void add_car() {
        System.out.println("car is add");
        System.out.println("brand is : " + brand);
        System.out.println("price is: " + price);

    }
}

public class practice_class {
    public static void main(String[] args) {
        car c1 = new car();
        c1.add_car();
    }
}
