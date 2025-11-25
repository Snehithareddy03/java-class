class Test{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1();
        p1.m2();
        Child c1 = new Child();
        c1.m3();
        c1.m2();
        Parent c2 = new Child();
        c2.m1();
        c2.m2();
        
    }
}