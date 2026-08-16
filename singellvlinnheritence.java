class number {
    public void check_num() {
        System.out.println("hello all number !");
    }
}

class check extends number {
    public void compare_and_add(int a, int b) {
        int p = a + b;
        System.out.println("the sum of the number is " + p);
        if (a > b) {
            System.out.println("the number is bigger is " + a);
        } else {
            System.out.println("b is bigeer the a " + b);
        }
    }
}

public class singellvlinnheritence {
    public static void main(String[] args) {
        check c1 = new check();
        c1.check_num();
        c1.compare_and_add(15, 25);
    }
}
