import java.util.*;

class Product{
    public int pid;
    public int price;
    public int quantity;

    Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class Assignment39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Product arr[] = new Product[5];

        for(int i=0; i < arr.length; i++){
            System.out.println("Enter Product Id : ");
            int pid = sc.nextInt();
            System.out.println("Enter Product Price : ");
            int price = sc.nextInt();
            System.out.println("Enter Quantity : ");
            int quantity = sc.nextInt();

            Product p = new Product(1,500,5);
            
            arr[i] = p;
        }
        int max = arr[0].price;
        for(int i=0; i<arr.length; i++){
            max = arr[0].price;
            if(max < arr[i].price){
                max = arr[i].price;
            }
        }
        System.out.println("Max Value = "+max);
    }
}