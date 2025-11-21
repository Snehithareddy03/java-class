public class foreachloop {
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105};
        for(int eid :eids){
            System.out.println(eid);
        }
        String[] enames ={"sonia","rahul","priya"};
        for(String ename :enames){
            System.out.println(ename);
        }
        double[] prices ={99.9,199.9,299.9,399.9};
        for(double price:prices){
            System.out.println(price);
        }
    }
}
