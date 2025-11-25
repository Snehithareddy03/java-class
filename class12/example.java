class parent {
    public void m1(){
        System.out.println("public method m1-class parent");
    }
    public void m2(){
        System.out.println("public method m2 -class parent");
    }
}
class child extends parent{
    public void m1(){
        System.out.println("child class - public method m1");
    }
    public void m3(){
        System.out.println("child class public method m3");
    }
}
class Test{
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.m1();
        p1.m2();
        System.out.println("******************************************************");
        child c1 = new child();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println("******************************************************");
        parent c2 = new child();
        c2.m1();
        c2.m2();
        //c2.m3();
    }
}
