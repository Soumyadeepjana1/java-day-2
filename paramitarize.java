
//constractor peramitarise

class dog {
    String name;
    String age;

    public void print_dog() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // constractor parameterize

    dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // copy constractor

    dog(dog d2) {
        this.name = d2.name;
        this.age = d2.age;
    }
}

public class paramitarize {
    public static void main(String[] args) {
        dog d1 = new dog("doges", "5years");
        d1.print_dog();

        dog d2 = new dog(d1);
        System.out.println(d2.name);
        System.out.println(d2.age);

    }

}
