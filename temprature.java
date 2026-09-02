// double fahrenheit = (celsius * 9 / 5) + 32;

//double celsius = (fahrenheit - 32) * 5 / 9;

import java.util.Scanner;

public class temprature {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what you want to chose: 1  or 2");
            int i = sc.nextInt();

            if(i == 1){
                System.out.println("enter temprature: ");
                double f = sc.nextDouble();
                double s = (f * 9 / 5)+ 32;
                System.out.println("faranhite value is: "+ s);

            }
            else{
                System.out.println("enter your temprature");
                double p = sc.nextDouble();
                double t = (p - 32)* 5 / 9;
                System.out.println("celcious number is"+ t);
            }

        sc.close();
    }
}
