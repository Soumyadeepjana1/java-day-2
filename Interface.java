interface car {
    void start();

}

class bmw implements car {
    public void start() {
        System.out.println("BMW IS START");
    }
}

public class Interface {
    public static void main(String[] args) {
        bmw b1 = new bmw();
        b1.start();
    }
}
