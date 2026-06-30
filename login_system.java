import java.util.Scanner;

public class login_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to our system!!  hello ");
        System.out.println("enter plese enter your user name: ");
        String user = sc.next();
        System.out.println("plese enter your password");
        int password = sc.nextInt();
        if (!user.equals("soumyadeep123"))
            System.out.println("user not found");
        else if (user.equals("soumyadeep123") && password == 123)
            System.out.println("log in succesfull!");
        else if (user.equals("soumyadeep123") && password != 123)
            System.out.println("password is worng please enter correct password");
        else
            System.out.println("please fill currect user id");
        sc.close();
    }
}
