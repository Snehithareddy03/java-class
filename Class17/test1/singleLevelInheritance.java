class parent{
    public void m1(){
        System.out.println("parent classs-public method with no return type");
    }
}
class child extends parent{
    public void m2(){
        System.out.println("child class-public mehod m2 with no return typr");
    }
    public void m3(){
        System.out.println("child class-public method m3 with mo return type");
    }
}
public class singleLevelInheritance {
    public static void main(String[] args) {
        parent p1 = new parent();
        p1.m1();
        System.out.println("---------------------------");
        child c1 = new child();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println("---------------------------");
        parent c2 =new child();
        c2.m1();
        // c2.m2();-->it is not possible because parent type doesnot have child methods
        // c2.m3();
        // child p2 = new parent(); --> child cant hold parent object
    }
}
