interface Taxable{
    double salesTax = 0.07;
    double incomeTax = 0.105;

    abstract void calcTax();
}

class Employee implements Taxable{
    int empId;
    String empName;
    float salary;

    Employee(){

    }
    Employee(int empId, String empName, float salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void calcTax(){
        double yearSalary;
        yearSalary = salary + (salary * salesTax * incomeTax);
        System.out.println("Yearly Salary = "+yearSalary);
    }
}

class Product implements Taxable{
    int pid;
    float price;
    int quantity;

    Product(){

    }
    Product(int pid, float price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax(){
        double tax = salesTax * price;
        System.out.println("SalesTax = "+tax);
    }
}

class Assignment49{
    public static void main(String args[]){
        Employee e = new Employee(1,"Pratham",12000F);
        e.calcTax();

        Product p = new Product(1,2040.5F,5);
        p.calcTax();
    }
}