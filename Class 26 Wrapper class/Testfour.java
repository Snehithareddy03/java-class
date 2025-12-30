
// read two number from command line and sum of them.
public class Testfour {
    public static void main(String[] args) {
        // reading value from command line & cmd by default type is string
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);  
        float c = Float.parseFloat(args[2]);
        System.out.println(a+b);
        System.out.println(a+c);
    }
}
