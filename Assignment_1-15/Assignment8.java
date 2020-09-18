import java.util.Scanner;
class Assignment8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		int p = sc.nextInt();
		System.out.print("Enter Rate of Intrest: ");
		int r = sc.nextInt();
	
		System.out.print("Enter Number of Years: ");
		int n = sc.nextInt();
		
		float si = (p*r*n)/100;
		System.out.printf("The Simple Intrest is : %.3f",si);		
	}
}