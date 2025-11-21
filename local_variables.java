class Test{
    int a =100;
    static int b = 100;
public void m1(){
    int c =300;
    System.out.println(c);
}
public void m2(){
    // int d these give you error 
    // local variable requires initalization
    int d = 100;//these will work well without error
    System.out.println(d);
}
public static void main(String args[]){
    Test t1=new Test();
    t1.m1();
    t1.m2();
    System.out.println(t1.a);
    System.out.println(t1.b);
    new Test().m1();
    new Test().m2();
}
