package kunal;

import java.util.Scanner;
public class charchecker {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("write a word number is vowel and consonent ");
        char p = sc.next().charAt(0);

        for(char i = 'a'; i <= 'z';i ++){
            if(i =='a' || i == 'e' || i == 'o' || i == 'u' && p =='a' || p == 'e' || p == 'o' || p == 'u'){
                System.out.println("VOWEL IS "+ p);
                System.out.println("number is vowel " + i);
                
            }
            else{
                System.out.println("number is consonent " + i);
                System.out.println("CONSONENT IS "+p);
            }
        }
        sc.close();
    }
}
