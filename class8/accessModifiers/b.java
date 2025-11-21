package pack1;
class b {
    public void m5(){
        System.out.println("default class b -public method m5");
    }
    public static void main(String[] args) {
        a A = new a();
        A.m1();
        A.m2();
        //A.m3();
        A.m4();
         b A2=new b();
        A2.m5();
    }
}
