abstract class animal {
    abstract void walk();
}

class men extends animal {
    public void walk() {
        System.out.println("men walk");
    }
}

class chicken extends animal {
    public void walk() {
        System.out.println("chicken walk");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        men m1 = new men();
        m1.walk();

        chicken c1 = new chicken();
        c1.walk();
    }
}
