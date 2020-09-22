import java.util.*;

class Student{
    public String name;
    public int rollNo;
    public int age;
    public int score;

    Student(String n, int r, int a, int s){
        name = n;
        rollNo = r;
        age = a;
        score = s;
    }
}

class Assignment40{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Student arr[] = new Student[5];

        for(int i=0; i<arr.length; i++){

            System.out.println("Enter name : ");
            String name = sc.next();
            System.out.println("Enter Roll Number : ");
            int rollNo = sc.nextInt();
            System.out.println("Enter Age : ");
            int age = sc.nextInt();
            System.out.println("Enter Score : ");
            int score = sc.nextInt();

            Student s = new Student(name,rollNo,age,score);

            arr[i] = s;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i].score < 50){
                System.out.println("Range Between 0-50 "+arr[i].score);
            }
            else if(arr[i].score <= 50 || arr[i].score < 65){
                System.out.println("Range Between 50-65 "+arr[i].score);
            }
            else if(arr[i].score <= 65 || arr[i].score < 80){
                System.out.println("Range Between 65-80 "+arr[i].score);
            }
            else{
                System.out.println("Range Between 80-100 "+arr[i].score);
            }
        }        
    }
}