package kunal;

public class largestnumber {
    public static void main(String [] args){
    int i = 1;
    int max = 1;
    while(i <= 10){
        if(i >= max){
        max = i;
        }
        i++;
    }
    System.out.println(max);
    }
}
