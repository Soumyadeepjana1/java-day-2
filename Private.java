class Animal {
    private String type = "cobra";
    private String name = "john";

    public String getype() {
        return type;
    }

    public String getname() {
        return name;
    }
}

class men extends Animal {
    public void print_info() {
        System.out.println(getype());
        System.out.println(getname());
    }
}

public class Private {
    public static void main(String[] args) {
        men m1 = new men();
        m1.print_info();
    }
}
