class Faculty{
    public int facultyId;
    public double salary;

    Faculty(){

    }

    void input(int facultyId){
        this.facultyId = facultyId;
    }

    double getSalary(){
        return salary;
    }

    void setSalary(int salary){
        this.salary = salary;
    }

    void printData(){
        System.out.println("Faculty Id = "+facultyId+": Salary = "+salary);
    }
}

class FullTimeFaculty extends Faculty{
    public int basicSalary;
    public int allowance;

    void input(int facultyId){
        super.input(facultyId);
    }

    void input(int basicSalary, int allowance){
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        setSalary(basicSalary + allowance);
    }
}

class PartTimeFaculty extends Faculty{
    public int workingHours;
    public int ratePerHour;

    void input(int facultyId){
        super.input(facultyId);
    }

    void input(int workingHours, int ratePerHour){
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;

        setSalary(workingHours * ratePerHour);
    }
}

class Assignment44{
    public static void main(String args[]){
        Faculty f = new Faculty();
        FullTimeFaculty ft = new FullTimeFaculty();
        PartTimeFaculty pt = new PartTimeFaculty();
        pt.input(1);
        pt.input(50,50);
        pt.printData();

        ft.input(2);
        ft.input(20,20);
        ft.printData();
    }
}