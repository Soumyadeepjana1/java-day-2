class passmanager {

    String bank_name = "cobra bank"; // defult acces modifire #######################

    protected String bank_code = "123";

    public int password = 123456789; // ## public acces modifire
    public String name = "don";

    private String user_name = "Soumyadeep"; // private acces modifire
                                             // $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    private int user_password = 123456789;

    public String show_user() {
        return user_name;

    }

    public int show_password() {
        return user_password;
    }

}

class sub extends passmanager {
    public void show_class() {
        System.out.println(bank_code);

    }
}

public class publicaccesmodifire {
    public static void main(String[] args) {
        passmanager p1 = new passmanager();
        System.out.println(p1.password);
        System.out.println(p1.name);

        System.out.println(p1.show_user());
        System.out.println(p1.show_password());

        System.out.println(p1.bank_code);

        sub p2 = new sub();
        p2.show_class();
    }
}
