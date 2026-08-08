import java.util.Scanner;

public class practiceday2 {
    public static void main(String[] args) {
        System.out.println("plese enter your studen  details");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter studen name: ");
        String name = sc.nextLine();
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        System.out.println("enter 3 sub ject marks  subject1 and subject2  and subject3 ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        System.out.println("student name is " + name);
        System.out.println("studen age is " + age);
        int total = sub1 + sub2 + sub3;
        System.out.println("total marks is " + total);
        System.out.println("avarage of marks is " + total / 3);
        System.out.println("parcentage of subject 1 marks is " + ((double) sub1 / 100 * 100));
        System.out.println("parcentage of subject 2 marks is " + ((double) sub2 / 100 * 100));
        System.out.println("parcentage of subject 3 marks is " + ((double) sub3 / 100 * 100));

        System.out.println("total parcentage is " + ((double) total / 300 * 100));

        sc.close();

    }
}
