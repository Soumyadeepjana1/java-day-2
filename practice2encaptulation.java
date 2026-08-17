class person {
    int age;

    public void setage(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
            System.out.println("valid user");
        } else {
            System.out.println("invalid user");
        }
    }

    public int getage() {
        return age;
    }
}

public class practice2encaptulation {
    public static void main(String[] args) {
        person p1 = new person();
        p1.setage(100);
        System.out.println(p1.getage());

        person p2 = new person();
        p2.setage(-12);
        System.out.println(p2.getage());
    }
}
