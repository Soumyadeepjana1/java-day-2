class colage {
    String name;
    int age;

    public void collage_info() {
        String name = "Jadavpur univercity";
        int age = 22;
        System.out.println("name " + name);
        System.out.println(age);
    }

    public void collage_info(String name, int age) {
        System.out.println("name" + name);
        System.out.println(age);
    }

    public void collage_info(int age) {
        System.out.println(age);
    }
}

public class practicepolly {
    public static void main(String[] args) {
        colage c1 = new colage();
        c1.collage_info();

        colage c2 = new colage();
        c2.name = "cobra school";
        c2.age = 22;

        colage c3 = new colage();
        c3.age = 25;
        c3.collage_info();

    }
}
