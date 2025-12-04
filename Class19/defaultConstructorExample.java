class Test{
    int a;
    byte b;
    char c;
    String s;
    boolean x;
    short e;
    float f;
    double d;
    long l;

    public Test() {
        this.a =0;
    }
    
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(t1.c);
        System.out.println(t1.s);
        System.out.println(t1.x);
        System.out.println(t1.e);
        System.out.println(t1.f);
        System.out.println(t1.d);
        System.out.println(t1.l);

    }
}