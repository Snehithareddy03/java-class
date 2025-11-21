class account{
    int acc_Id;
    String acc_Name;
    double acc_Bal;
    static String bank_Name;
    static String branch_Name;
public static void main(String args[]){
    account a1=new account();
    a1.acc_Id=101;
    a1.acc_Name="Rahul";
    a1.acc_Bal=45000;
    account.bank_Name="SBI";
    account.branch_Name="Marthahalli";
    account a2= new account();
    account a3= new account();
    System.out.println(a1.acc_Id);
    System.out.println(a1.acc_Name);
    System.out.println(a1.acc_Bal);
    System.out.println(bank_Name);
    System.out.println(branch_Name);
}
}