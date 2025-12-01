interface Bank{
    double min_Bal = 500.00;
}
class Account implements Bank{
    public static void main(String[] args) {
        Bank a1 = new Account();
        //a1.min_Bal = 600.00 cant be modified because it is final 
        System.out.println(a1.min_Bal);
    }
}