class Employee{
    static private int empNo = 0;
    static private int salary;
    static private int totalSalary = 0;

     Employee(int salary){
        this.salary = salary;
        empNo+=1;
        totalSalary+=salary;

        show();
    }

    void show(){
        System.out.println("empNo = "+empNo+"  Total Salary = "+totalSalary);
    }
}

class Assignment38{
    public static void main(String args[]){

        Employee e1 = new Employee(25000);
        Employee e2 = new Employee(35000);
        Employee e3 = new Employee(45000);

        
    }
}