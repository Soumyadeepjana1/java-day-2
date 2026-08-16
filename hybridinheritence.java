class school {
    String name;
    String location;

    public void print_info() {
        System.out.println(" school info ");
    }
}

class clg extends school {
    String collage_name;

    public void clg_info() {
        System.out.println("collage name is" + collage_name);
        System.out.println("school location is" + location);
    }
}

class university extends school {
    String university_name;

    public void university_info() {
        System.out.println("university name is" + university_name);
        System.out.println("location" + location);
    }
}

class student extends university {
    String student_name;
    int roll_no;

    public void student_info() {
        System.out.println("student name is" + student_name);
        System.out.println("roll no is" + roll_no);
    }
}

public class hybridinheritence {
    public static void main(String[] args) {
        school s1 = new school();
        s1.name = "bbhs";
        s1.location = "wb";
        s1.print_info();

        clg c1 = new clg();
        c1.collage_name = "jadavpur";
        c1.location = "wb";
        c1.clg_info();

        university u1 = new university();
        u1.university_name = "calcutta";
        u1.location = "wb";
        u1.university_info();

        student st1 = new student();
        st1.student_name = "soumyadeep";
        st1.roll_no = 123;
        st1.location = "wb";
        st1.student_info();
    }
}
