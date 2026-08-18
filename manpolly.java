class human {
    String name;
    int age;

    public void human_info(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("name of human is " + name);
        System.out.println("age of human is " + age);

    }

    public void human_info(String name) {
        this.name = name;
        System.out.println("name of the human is" + name);

    }

    public void human_info(int age) {
        this.age = age;
        System.out.println("the humenage is" + age);
    }
}

public class manpolly {
    public static void main(String[] args) {
        human h1 = new human();
        h1.human_info("soumyadeep", 22);
        h1.human_info("king");
        h1.human_info(h1.age);
    }
}
