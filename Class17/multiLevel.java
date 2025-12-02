class Bank{
    public String m1(){
        return "STATE BANK INDIA";
    }
    public void m2(){
        System.out.println("public class-no return type");
    }
}
class Account extends Bank{
    public void m3(){
        System.out.println("account type");
    }
    public double m4(){
        return 35.00;
    }
}
class SavingAccount extends Account{
    public void m5(){
        System.out.println("balance");
    }
    public boolean m6(){
        return false;
    }
}
class demo {
    public static void main(String[] args) {
        SavingAccount s1 = new  SavingAccount();
        s1.m2();
        s1.m3();
        s1.m5();
        System.out.println(s1.m1());
        System.out.println(s1.m4());
        System.out.println(s1.m6());

    }
}