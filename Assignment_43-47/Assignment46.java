class Person1{
    public int pid;
    public String pname;

    Person1(){

    }
    Person1(int pid, String pname){
        this.pid = pid;
        this.pname = pname;
    }

    void show(){
        System.out.println("Person id = "+pid+":  Person Name = "+pname);
    }
}

class Employee extends Person1{
    public String job;

    Employee(){

    }
    Employee(int pid, String pname, String job){
        super(pid,pname);
        this.job = job;
    }

    void show(){
        super.show();
        System.out.println("Job Profile = "+job);
    }
}

class Assignment46{
    public static void main(String args[]){
        Person1 arr[] = {new Person1(),new Employee(1,"Pratham","Manager")};

        for(Person1 a : arr){
            if(a instanceof Employee){
                a.show();
            }
        }
    }
}