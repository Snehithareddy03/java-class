class mobiles{
    String brand;
    float price;
    int launch_year;
    public void show()
    {
        System.out.println("mobile name"+ brand+"price"+ price+"year of release"+ launch_year);
    }
}
public class eg_mobiles{
public static void main(String args[]){
    mobiles obj1=new mobiles();
    obj1.brand = " Apple";
    obj1.price =  25000;
    obj1.launch_year= 2021;
    obj1.show();
//     System.out.println(obj1.brand);
//     System.out.println(obj1.price);
//     System.out.println(obj1.launch_year);
}
}
