class name {
    String num;
    int number;

    public void printname(String num) {
        System.out.println(num);
    }

    public void printname(int number) {
        System.out.println(number);
    }

    public void printname(String num, int number) {
        System.out.println(num + " " + number);
    }
}

public class polly2 {
    public static void main(String[] args) {
        name n1 = new name();
        n1.num = "soumyadeep";
        n1.number = 123456789;

        n1.printname(n1.num);
        n1.printname(n1.number);
        n1.printname(n1.num, n1.number);

        name s1 = new name();
        s1.num = "don";
        s1.number = 123456;

        s1.printname(s1.num + " " + s1.number);

    }
}