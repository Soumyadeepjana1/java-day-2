package constructors;

import java.util.Scanner;

public class scan {
    String name;
    int id;

    scan(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        System.out.println("Enter your UID:");
        int id = sc.nextInt();

        sc.close();

        scan s1 = new scan(name, id);

        // Added clean spacing between variables
        System.out.println("Name: " + s1.name + " | ID: " + s1.id);
    }
}
