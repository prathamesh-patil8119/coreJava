import java.util.Scanner;
class Assignment7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of 5 Subjects: ");
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt(); 
		int mark3 = sc.nextInt(); 
		int mark4 = sc.nextInt(); 
		int mark5 = sc.nextInt();
		float average = (mark1 + mark2 + mark3 + mark4 + mark5)/5F;
		System.out.printf("The Average marks of 5 Subjects: %.3f",average);
	}
}