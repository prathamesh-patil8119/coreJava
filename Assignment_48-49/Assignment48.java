import java.util.*;

abstract class Processor{
    int data;

    abstract void process();

    void showData(){
        System.out.println(data);
    }
}

class Factorial extends Processor{

    public void process(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        data = 1;
        while(n > 0){   
            data = data * n;
            n--;
        }
    }
}

class Circle extends Processor{
    Scanner sc = new Scanner(System.in);
    public void process(){
        System.out.println("Enter Radius of a Circle");
        int r = sc.nextInt();
        data = (int)3.14 * r * r;
    }
}

class Assignment48{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Factorial f = new Factorial();
                f.process();
                f.showData();
                break;
        
            case 2:
                Circle c = new Circle();
                c.process();
                c.showData();
                break;

            default:
                System.out.println("Enter Valid Choice");
        }
        
    }
}