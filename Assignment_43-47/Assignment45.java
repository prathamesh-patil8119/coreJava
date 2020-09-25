import java.util.*;

class Student{
    public int rollNo;
    public double percentage;

    Student(){

    }
    
    Student(int rollNo, double percentage){
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    void show(){
        System.out.println("Roll Number = "+rollNo+": Percentage = %"+percentage);
    }
}

class CollegeStudent extends Student{
    public int semester;

    CollegeStudent(){

    }

    CollegeStudent(int rollNo, double percentage, int semester){
        super(rollNo,percentage);
        this.semester = semester;
    }

    void show(){
        super.show();
        System.out.println("Semester = "+semester);
    }
}

class SchoolStudent extends Student{
    public int className;

    SchoolStudent(){

    }

    SchoolStudent(int className, int rollNo, double percentage){
        super(rollNo,percentage);
        this.className = className;
    }

    void show(){
        super.show();
        System.out.println("Class Name = "+className);
    }
}

class Assignment45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Student arr[] = {new CollegeStudent(35,82.5D,3),
                            new CollegeStudent(13,86.3D,4),
                            new SchoolStudent(12,11,78.75D),
                            new SchoolStudent(12,34,84.32D),
                            new SchoolStudent(12,70,82.67D),
                         };
                         
        for(Student s : arr){
            s.show();
        }
    }
}