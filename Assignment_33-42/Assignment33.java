class ThisConcept{
    private int empno;
    private String empName;

    void setData(int empno, String empName){
        this.empno = empno;
        this.empName = empName;
    }

    void showData(){
        System.out.println("Empno = "+empno+"  "+"EmpName = "+empName);
    }
}

class Assignment33{
    public static void main(String args[]){
        ThisConcept t = new ThisConcept();
        t.setData(101,"Pratham");
        t.showData();
    }
}