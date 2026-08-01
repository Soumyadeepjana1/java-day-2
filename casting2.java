public class casting2 {
    public static void main(String[] args) {
        int age = 100;
        double rs = 18.5;
        int lp = ((int) rs + (int) age); // type custing
        double kp = ((double) rs + (double) age); // type
        byte k = (byte) age;
        System.out.println(kp);
        System.out.println(lp);
        System.out.println(k);

        System.out.println(((Object) age).getClass().getSimpleName()); // find type of value
        System.out.println(((Object) rs).getClass().getSimpleName());
        System.out.println(((Object) k).getClass().getSimpleName());

    }
}
