class student {
    private String name;
    private int marks;
    private int age;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setmarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("marks is valid");
        } else {
            System.out.println("marks is in valid");
        }
    }

    public int get_marks() {
        return marks;
    }

    public void setage(int age) {

        if (age >= 0) {
            this.age = age;
            System.out.println("age is valid ");
        } else {
            System.out.println("age is invalid");
        }
    }

    public int getage() {
        return age;
    }
}

public class practiceget {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setname("soumyadeep");
        s1.setage(22);
        s1.setmarks(45);

        System.out.println(s1.getname());
        System.out.println(s1.get_marks());
        System.out.println(s1.getage());

        student s2 = new student();
        s2.setname("john");
        s2.setage(-10);
        s2.setmarks(1000);

        System.out.println(s2.getname());
        System.out.println(s2.getage());
        System.out.println(s2.get_marks());

    }
}
