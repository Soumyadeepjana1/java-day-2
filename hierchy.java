
///////////// hierchy inheritenes

class animal {
    public void eat() {
        System.out.println("from main base class");
    }
}

class tiger extends animal {
    public void eat() {
        System.out.println("PRINT FROM CLASS 1 TIGER ");
    }
}

class lion extends animal {
    public void eat() {
        System.out.println("PRINT FROM CLASS 2 LIon");
    }
}

public class hierchy {
    public static void main(String[] args) {
        tiger t1 = new tiger();
        t1.eat();

        lion l1 = new lion();
        l1.eat();
    }
}
