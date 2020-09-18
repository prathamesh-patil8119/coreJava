import java.util.Scanner;
class Assignment11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Value: ");
		int a = sc.nextInt();

		System.out.print("Enter Second Value: ");
		int b = sc.nextInt();

		a = a + b;
		b = a - b;
  		a = a - b;
		
		System.out.print(a+" "+b);
	}
}