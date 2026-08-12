// Create a Mobile class with brand and price. Create an object and display its details using a method.
// Create a Person class with name and age. Create an object and create a display() method that prints the person's name and age.

class mobile {
    String brand;
    int price;

    public void phone() {
        System.out.println(this.brand);
        System.out.println(this.price);
    }
}

class person {
    String name;
    int age;

    public void men() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class mobileclass {
    public static void main(String[] args) {
        mobile ph1 = new mobile();
        ph1.brand = "oppo";
        ph1.price = 100000;

        ph1.phone();

        person man1 = new person();
        man1.name = "soumyadeep";
        man1.age = 22;
        man1.men();

    }

}
