abstract class human {
    abstract void breathe(); // Abstract method (no body)
}

class male extends human {
    // Must implement abstract method breathe()
    public void breathe() {
        System.out.println("Male is breathing...");
    }

    public void name(String name) {
        System.out.println("hello my name is: " + name);
    }
}

class female extends human {
    // Must implement abstract method breathe()
    public void breathe() {
        System.out.println("Female is breathing...");
    }

    public void name(String name) {
        System.out.println("hello my name is: " + name);
    }
}

class others extends human {
    // Must implement abstract method breathe()
    public void breathe() {
        System.out.println("Others are breathing...");
    }

    public void name(String name) {
        System.out.println("hello my name is: " + name);
    }
}

public class abst6raction {
    public static void main(String[] args) {
        male m1 = new male();
        m1.name("Soumyadeep");
        m1.breathe();

        female f1 = new female();
        f1.name("Riya");
        f1.breathe();

        others o1 = new others();
        o1.name("Alex");
        o1.breathe();
    }
}
