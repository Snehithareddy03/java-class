import java.util. Collections;
import java.util.LinkedList;
public class linkedlistexample1 {
  public static void main(String[] args) {
      LinkedList <Integer> eids = new LinkedList<Integer>();
      eids.add(101);
      eids.add(102);
      eids.add(103);
      System.out.println(eids);
      Collections.sort(eids);
      System.out.println(eids);
      Collections.sort(eids,Collections.reverseOrder());
      System.out.println(eids);
  }  
}
