interface Bank{
    public abstract double calc_Bal();
}
class Account implements Bank{
    @Override public double calc_Bal(){
            return 500.00;
        }
    }
class Demo{
    public static void main(String[] args) {
        Bank a1 = new Account();
        System.out.println(a1.calc_Bal());
    }

}