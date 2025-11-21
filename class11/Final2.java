class parent{
    public void m1(){
        System.out.println("parent class - public menthod m1");
    }
    public void m2(){
        System.out.println("parent class public method m2");
    }
}
class child extends parent{
    public void m1(){ // method m1 is overridden in chilc class
        System.out.println("child class - over ridden method m1");
    }
    public void m3(){
        System.out.println("child class method m3");
}}
class Test{
public static void main(String[] args) {
    parent p1 = new parent();
    p1.m1();
    p1.m2();
    System.out.println("*************************************");
    child c1 = new child();
    c1.m1();
    c1.m2();
    c1.m3();
    System.out.println("*************************************");
    parent c2 = new child();
    c2.m1();
    c2.m2();
    //c2.m3();// not possible because c2 is parent type,m3 method is child class method

}
}
