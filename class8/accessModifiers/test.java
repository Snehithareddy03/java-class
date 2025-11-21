package pack2;
import pack1.a;
class test{
public static void main(String[] args) {
    a A = new a();
    A.m1();
    // A.m2(); m2() is not public in a; cannot be accessed from outside package
    //A.m3(); m3() has private access 
    //A.m4(); m4() has protected access
}
}