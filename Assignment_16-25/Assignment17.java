import java.util.Scanner;
class Assignment17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num != 0){
		
		int rem = num % 10;
		rev = (rev * 10) + rem;
		num = num / 10;	
		}
	
		System.out.print("Reversed of a Number: "+rev);
	}
}