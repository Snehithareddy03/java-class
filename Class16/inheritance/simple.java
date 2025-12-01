class parent {
    public void m1(){
        System.out.println("parent class-m1 method");
    }
}

class child extends parent{
    public void m2(){
        System.out.println("child method m2");
    }
}

class Test{
    public static void main(String[] args) {
        child c1 = new child();
        c1.m1();
        c1.m2();
    }
}
