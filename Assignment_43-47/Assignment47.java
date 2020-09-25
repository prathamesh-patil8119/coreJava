class Employee{
    public int eId;
    public String eName;

    Employee(){
        System.out.println("Zero Parameterized Constructor of Employee");
    }
    Employee(int eId, String eName){
        this();
        this.eId = eId;
        this.eName = eName;
        System.out.println("Parameterized Constructor of Employee");
    }
}
class Manager extends Employee{
    public String job;

    Manager(){
        super();
        System.out.println("Zero parameterized Manager");
    }
    Manager(int eId, String eName){
        super(eId,eName);
        System.out.println("Parameterized Manager");
    }
}

class Assignment47{
    public static void main(String args[]){
        Employee e1 = new Manager(1,"Pratham");
        Employee e2 = new Employee();
    }
}