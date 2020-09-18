import java.util.Scanner;
class Assignment6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float pi = 3.14F;
		System.out.print("Enter Radius of a Circle: ");
		int radius = sc.nextInt();
		float area = pi * radius * radius;
		System.out.printf("The area of a Circle is :%.3f \n",area);

		float circumferance = 2 * pi * radius;
		System.out.println("The Circumferance of a Circle is: "+circumferance);		
	}
}