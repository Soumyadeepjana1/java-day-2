import java.util.Scanner;

public class Sstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "soumyadeep";
        String surname = "jana";
        String ns = name + surname;
        System.out.println(ns);

        System.out.println(name.charAt(1)); // give output of index no 1
        System.out.println(name.replace("s", "g")); // replace s with g
        System.out.println(name.substring(0, 4)); // give output from index no 0 to 4

        System.out.println(name.toUpperCase()); // convert string to upper case
        System.out.println(name.toLowerCase()); // convert string to lower case
        System.out.println(name.indexOf("s")); // find index of s
        System.out.println(name.lastIndexOf("s")); // find last index of s
        System.out.println(name.startsWith("s")); // check if string starts with s
        System.out.println(name.endsWith("s")); // check if string ends with s
        System.out.println(name.contains("s")); // check if string contains s
        System.out.println(name.replace("s", "g")); // replace s with g
        System.out.println(name.replace("s", "g")); // replace s with g
        System.out.println(name.replace("s", "g")); // replace s with g

        System.out.println(sc.nextInt());
        sc.close();

    }
}
