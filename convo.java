public class convo {
    public static void main(String [] args){
        int a = 12;
        int b = 16;

        int d = 14;
        float t = (float)(d);
        System.out.println(a + b);

        String s  = String.valueOf(a);
        System.out.println(s);
        System.out.println(s.getClass().getName());
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(t);
        

    }
    
}
