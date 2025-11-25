package pack1;
public class A{
    public void m1(){
        System.out.println("public class A - public method m1");
    }
    void m2(){
        System.out.println("public class A - default method m1");
    }
    private void m3(){
        System.out.println("public class A - private method m3");
    }
    protected void m4(){
        System.out.println("public class A- protected method m4");
    }
    public static void main(String[] args) {
        A a1 = new A();
        a1.m3();//accessing private method m3
    }
}