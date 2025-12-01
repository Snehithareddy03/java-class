public class demo {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setEid(101);
        e1.setEname("rahul");
        e1.setLoc("Bangalore");
        e1.setAvail(true);
        System.out.println(e1.getEname());
        System.out.println(e1.isAvail());
        System.out.println(e1.getLoc());
        System.out.println(e1.getLoc());
    }
}
