public class exception {
//     public static void main(String[] args) {
//         String[] marks = { "i", "k", "u", "b", "l" };
//         try {
//             System.out.println(marks[8]);
//         } catch (Exception e) {
//             System.out.println("this marks is not avalable");
//         } finally {
//             System.out.println("end the program");
//         }
//     }
// }

        public static void main(String [] args){
            int age = 18;
            try{
                if(age >= 18){
                    System.out.println("you are eligibe for votting");
                }
                else{
                    System.out.println("you are not eligibe for voting");
                }
            } catch (Exception e){
                if(age <= 15){
                    System.out.println("you are too small");
                }
            } finally{
                System.out.println("thanks!");
            }
        }
}