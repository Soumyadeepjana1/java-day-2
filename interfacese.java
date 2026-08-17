interface human {
    public void walk();
}

class male implements human {
    public void walk() {
        System.out.println("male are also walk on 2 leges");
    }
}

class female implements human {
    public void walk() {
        System.out.println("women are also walk in 2 legs");
    }
}

public class interfacese {
    public static void main(String[] args) {
        male m1 = new male();
        m1.walk();

        female f1 = new female();
        f1.walk();
    }

}
