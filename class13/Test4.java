abstract class Bank{
    public abstract double cal_Interest();
    
    public String get_Name(){
        return "Rahul";
    }
    public void get_Details(){
        
    }
}
class Account extends Bank{
    public double cal_Interest(){
        return 0.0;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Account a1=new Account();
        System.out.println(a1.cal_Interest());
        System.out.println(a1.get_Name());
        a1.get_Details();
    }
}