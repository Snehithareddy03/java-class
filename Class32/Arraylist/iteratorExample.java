import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class iteratorExample{
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<>();
        // System.out.println(enames);
        enames.add("rahul gandhi");
        enames.add("sonia gandhi");
        enames.add("priyanka gandhi");
        enames.add("narendra modi");
        // System.out.println(enames);
        Iterator itr = enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(enames);
        System.out.println(enames);
        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);

    }
}