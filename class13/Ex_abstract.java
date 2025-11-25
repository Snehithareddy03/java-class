abstract class Bank{
    public abstract double cal_interest();
        public String get_Name(){
            return "Sonia";
    }
}
class Account extends Bank{
    public double cal_interest(){
        return 7.5;
    }
    public static void main(String[] args){
        Account a1 = new Account();
        System.out.println(a1.cal_interest());
        System.out.println(a1.get_Name());

    }
}