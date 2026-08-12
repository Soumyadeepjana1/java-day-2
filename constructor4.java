class dog {
    String name;
    int age;

    dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class constructor4 {
    public static void main(String[] args) {
        dog n1 = new dog("cobra", 22);

        System.out.println(n1.name);
        System.out.println(n1.age);
    }
}
