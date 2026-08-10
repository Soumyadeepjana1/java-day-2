class pen {
    String colour;
    String type;

    public void write() {
        System.out.println("write something for this pen");
    }
}

public class oops1st {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "red";
        pen1.type = "gel";

        pen1.write();
    }

}
