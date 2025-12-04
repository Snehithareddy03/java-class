class Employee {
    int eId;
    String eName;
    String gender;
    double eSal;
    Employee(int id, String name, String gender, double amount){
        this.eId = id;
        this.eName = name;
        this.gender = gender;
        this.eSal= amount;
    }
    public void add_bonus(double amount){
        this.eSal =this.eSal+amount;
    }
    public double get_Sal(){
        return this.eSal;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Rahul","Male",45000.00);
        Employee e2 = new Employee(102,"Sonia","Female",55000.00);
       System.out.println(e1.eId);
       System.out.println(e1.eName);
       System.out.println(e1.eSal);
       System.out.println(e1.gender);
       System.out.println("-----------------------------------------------------");
       System.out.println(e2.eId);
       System.out.println(e2.eName);
       System.out.println(e2.eSal);
       System.out.println(e2.gender);
       System.out.println("-----------------------------------------------------");
       e1.add_bonus(1000.00);
       System.out.println(e1.eSal);
       System.out.println(e1.get_Sal());//calling using method get_Sal(f)
    }

}