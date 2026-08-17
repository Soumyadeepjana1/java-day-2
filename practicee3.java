class product {
    private int productid;
    private double price;

    public int getproductid() {
        int productid = 123;
        return productid;

    }

    public void setprice(double price) {
        this.price = price;

    }

    public double getprice() {
        return price;
    }

}

public class practicee3 {
    public static void main(String[] args) {
        product p1 = new product();
        p1.getproductid();
        System.out.println(p1.getproductid());

        p1.setprice(1000);
        System.out.println(p1.getprice());

    }
}
