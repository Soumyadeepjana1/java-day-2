class mobile {
    String brand;
    int price;

    mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

public class constructor2 {
    public static void main(String[] args) {
        mobile phone = new mobile("oppo", 2000);
        System.out.println(phone.brand);
        System.out.println(phone.price);
    }
}
