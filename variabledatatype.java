public class variabledatatype {
    public static void main(String[] args) {
        String name = "soumyadeep";
        int age = 21;
        char a = 'a';
        System.out.println(name);
        System.out.println(age);
        System.out.println(a);
        System.out.println(name.getClass().getSimpleName());// help to find data type for non primitve like string
        // for primitve data type
        System.out.println(((Object) age).getClass().getSimpleName());
        System.out.println(((Object) a).getClass().getSimpleName());
        System.out.println(name.getClass().getSimpleName());
        System.out.println(((Object) age).getClass().getSimpleName());
    }
}
