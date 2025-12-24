import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        // iterate arraylist object & print all the emp name?
        //for loop
        for(int i=0; i<enames.size(); i++){
            System.out.println(enames.get(i));
        }
        //for each loop
        for (String ename:enames){
            System.out.println(ename);
        }
        //while loop
        int i =0;
        while(i<enames.size()){
            System.out.println(enames.get(i));
            i++;
        }
    }
}