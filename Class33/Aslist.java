import java.util.*;
class Test{
    public static void main(String[] args){
        List<Integer> uids = Arrays.asList(10,20,30,40);
        ArrayList<Integer> eids = new ArrayList<>(Arrays.asList(10,20,30,40));
        LinkedList<Integer> eid = new LinkedList<>(Arrays.asList(10,20,30,40));
        System.out.println(uids);//[10, 20, 30, 40]
        System.out.println(eids);//[10, 20, 30, 40]
        eids.add(50);
        System.out.println(eids);//[10, 20, 30, 40, 50] adding element at the last
        eids.set(0,5);
        System.out.println(eids);//[5, 20, 30, 40, 50] replacing alement at zeroth index
    }
}