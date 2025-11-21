class Test{
    // byte b;
    // short s;
    // int i;
    // long l;
    // float f;
    // double d;
    // char c;
    // boolean bl;
   int a;
   int b=10;
   static int c = 20;
    public static void main(String[] args) {
        Test t1=new Test();
        // System.out.println(t1.b);
        // System.out.println(t1.s);
        // System.out.println(t1.i);
        // System.out.println(t1.l);
        // System.out.println(t1.f);
        // System.out.println(t1.d);
        // System.out.println(t1.c);
        // System.out.println(t1.bl);
       System.out.println(t1.a);
       System.out.println(t1.b);       
       System.out.println(c);       
       System.out.println(c+t1.c+ Test.c);       
       System.out.println(c+t1.a+t1.b);       
       System.out.println(c+t1.c+t1.a);       
    }
}