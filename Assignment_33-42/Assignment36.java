import java.util.*;
class MathOpe{

    void multiply(int a, int b){
        int res = a * b;
        System.out.println("Two int Multiplication = "+res);
    }

    void multiply(float a, float b, float c){
        float res = a * b * c;
        System.out.println("Three float Multiplication = "+res);
    }
    
    void multiply(int arr[]){
        int res = 1;
        for(int i=0; i < arr.length; i++){
             res = res * arr[i];
        }
        System.out.println("Array Multilication = "+res);
    }

    void multiply(double a, int b){
        double res = a * b;
        System.out.println("Double and Int = "+res);
    }
}

class Assignment36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        MathOpe o = new MathOpe();
        o.multiply(2,5);
        o.multiply(2.5f,2.5f,2.5f);
        
        int arr[] = new int[5];
        
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        o.multiply(arr);
        o.multiply(2.5d,2);
     }
}