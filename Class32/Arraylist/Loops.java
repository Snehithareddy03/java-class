import java.util.ArrayList;
class Loops{
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<>();
        // System.out.println(enames);
        enames.add("rahul gandhi");
        enames.add("sonia gandhi");
        enames.add("priyanka gandhi");
        enames.add("narendra modi");
        // System.out.println(enames);

        // // using for loops
        // for (int i =0;i<enames.size();i++){
        //     System.out.println(enames.get(i));
        // }
        //using while
        // int i =0;
        // while(i<enames.size()){
        //     System.out.println(enames.get(i));
        //     i++;
        // }
        //using do while
        //  int i = 0;
        // do {
        //     System.out.println(enames.get(i));
        //     i++;
        // } while (i < enames.size());
        for (String name : enames) {
            System.out.println(name);
        }

    }
}