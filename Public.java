class human {
    public String name;
    public String age;
}

class male extends human {
    public void print_info(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.println("name of this person is" + name);

        System.out.println("age of this person is" + age);
    }
}

public class Public {
    public static void main(String[] args) {
        human h1 = new human();
        h1.name = "soumyadeep";
        h1.age = "22";
        System.out.println(h1.name + "" + h1.age);

        male m1 = new male();
        m1.print_info(h1.name, h1.age);
    }
}
