class don {
    String name;
    String age;
}

class father extends don {
    String name;
    String age;

    public void print_father_info() {
        System.out.println("print father name" + name);
        System.out.println("print fatehr age" + age);
    }
}

class son extends father {
    String name;
    String age;

    public void print_son_info() {
        System.out.println("print son name" + name);
        System.out.println("son age is" + age);
    }

}

// hierchycal inheritence:::::::::::

class teacher extends don {
    String name;
    String age;

    public void print_teacher_info() {
        System.out.println("print teacher name" + name);
        System.out.println("teacher age is" + age);
    }

}

class doctor extends don {
    String name;
    String age;

    public void print_doctor_info() {
        System.out.println("print doctor name" + name);
        System.out.println("doctor age is" + age);
    }

}

public class multilevel {
    public static void main(String[] args) {
        father f1 = new father();
        f1.name = "cobra";
        f1.age = "50";
        f1.print_father_info();

        son s1 = new son();
        s1.name = "soumyadeep";
        s1.age = "22";
        s1.print_son_info();

        // for hierchycal in heritence

        teacher t1 = new teacher();
        t1.name = "boos";
        t1.age = "60";
        t1.print_teacher_info();

        doctor d1 = new doctor();
        d1.name = "kobiraj";
        d1.age = "80";
        d1.print_doctor_info();

    }
}
