class math {

    int x = 10;
    int y = 20;

    String l;
    int m;

    public int add(int x, int y) {
        int r = x + y;
        return (r);
    }

    math(String l, int m) {
        this.l = l;
        this.m = m;
    }
}

class name {
    String name1 = "hello ji";
    String name2 = "hi ji";

    public String add(String name1, String name2) {
        String result = name1 + " " + name2;
        return result;
    }
}

class dog {
    String name = "doges";
    String breed = "cobra";

    String kutta = name + " " + breed;

    public String getkutta() {
        return kutta;
    }

    public void add() {
        System.out.println(name);
        System.out.println(breed);

    }
}

public class class4 {
    public static void main(String[] args) {
        math MATH = new math("Hello", 20);
        System.out.println(MATH.add(MATH.x, MATH.y));

        name nam = new name();
        String result = nam.add(nam.name1, nam.name2);
        System.out.println(result);

        dog pup = new dog();
        pup.add();

        String lt = pup.getkutta();
        System.out.println(lt);
    }
}
