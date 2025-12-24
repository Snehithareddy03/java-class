import java.util.ArrayList;
class Test1{
    public static void main(String[] args) {
        
        ArrayList<Integer> eids = new ArrayList<Integer>();
        //System.out.println(eids); // []
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        System.out.println(eids); // [101,102,103,104]
    }
}