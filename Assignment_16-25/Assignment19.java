import java.util.Scanner;
class Assignment19{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Number: ");
	int num = sc.nextInt();
	int sum = 0;
		for(int i=1; i<=num; i++){
			sum+=i*i;
		}
	System.out.print("The Sum of a Series is: "+sum);
	}	
}