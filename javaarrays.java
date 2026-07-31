import java.util.Arrays;
import java.util.Scanner;

public class javaarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read 5 integers into the age array
        int[] age = new int[5];
        System.out.print("Enter list of 5 numbers: ");
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }
        System.out.println("Age array: " + Arrays.toString(age));

        String[] cars = { "bmw", "volvo", "tesla", "skoda", "audi" };
        System.out.println("Number of cars: " + cars.length);
        System.out.println("Car at index 2: " + cars[2]);
        System.out.println("Car at index 4: " + cars[4]);

        sc.close();
    }
}
