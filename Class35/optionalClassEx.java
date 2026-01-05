// public class optionalClassEx {
//     public static void main(String[] args) {
//         String s1 = null;
//         System.out.println(s1.length());
//     }
// }


// using optional class of nullablle method to recitfy the error
import java.util.Optional;

class Test{
    public static void main(String[] args) {
        //String ename="RAHUL";
        String ename=null;
        Optional<String> opt=Optional.of(ename);
        if(opt.isPresent()){
            System.out.println(opt.get().toLowerCase());
        }
        else{
            System.out.println("String value Null");
        }
    }
}