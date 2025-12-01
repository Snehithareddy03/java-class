class Grandparent{
    public void m1(){
        System.out.println("grand parent method m1");
    }
}
class parent extends Grandparent{
    public void m2(){
        System.out.println("parent method method m2");
    }
}
class child extends parent{
    public void m3(){
        System.out.println("child class method m3");
    }
}
class Test{
    public static void main(String[] args) {
        child c1 = new child();
        c1.m1();
        c1.m2();
        c1.m3();
        
    }
}
