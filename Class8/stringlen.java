package Class8;
public class stringlen {
    public static void main(String[] args) {
        String[] enames= {"rahul","sonia","shalini"};
        System.out.println(enames.length);
        String ename = "rahul";
        if (ename.length()>=4){
            System.out.println("valid user");
        }
        else{
            System.out.println("String length is lessthan 4");
        }
    }
}
