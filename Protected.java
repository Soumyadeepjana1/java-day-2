class Info {
    String name;
    protected String mail;

    public void print_info(String name, String mail) {
        this.name = name;
        this.mail = mail;

        System.out.println("my name is " + name);
        System.out.println("my mail is " + mail);
    }
}

class Phone extends Info {

    public void phone_info() {
        System.out.println(mail);
    }
}

public class Protected {
    public static void main(String[] args) {

        Info p1 = new Info();

        p1.mail = "@cobramail.com";
        p1.name = "soumyadeep";

        p1.print_info(p1.name, p1.mail);

        Phone p2 = new Phone();

        p2.name = "soumyadeep";
        p2.mail = "kj@gmail.com";

        p2.phone_info();
    }
}