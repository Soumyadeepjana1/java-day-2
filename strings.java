public class strings {
    public static void main(String[] args){
        // strings
        //concatenate means kono 2 ti string k eksathe jora
        //replace kono word k replace kora jonno
        //substring boro string thwkw ki6u ekta part ber korbo
        String name1 = "soumyadeep";
        String name2 = "john the don";
        String name3 = name1 +  " doges "  +name2;
        String name4 = name1.replace('s','g'); // using replace funcation
        String name5 = name2.replace("j","t");
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name3);
        System.out.println(name3.length());
        System.out.println(name3.charAt(5));
        System.out.println(name4);
        System.out.println(name2.charAt(2));
        System.out.println(name5);
        System.out.println(name2.substring(5,10));

    }
}
