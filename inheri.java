class animal {
    String name;

    void bark() {
        System.out.println("bhaww bhaww");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("bhau" + name);
    }
}

class puppy extends dog {
    void bark() {
        System.out.println(name);
    }
}

class cat extends puppy {
    void bark() {
        System.out.println("mew " + name);
    }
}

public class inheri {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "cobra";
        System.out.println(d1.name);
        d1.bark();

        puppy p1 = new puppy();
        p1.name = "doges";
        p1.bark();

        cat c1 = new cat();
        c1.name = "bangad billaa";
        c1.bark();
    }
}
