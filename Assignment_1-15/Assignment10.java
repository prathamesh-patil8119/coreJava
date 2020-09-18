import java.util.Scanner;
class Assignment10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit : ");
		int f = sc.nextInt();
		float c = 5*(f-32)/9F;
		System.out.printf("Temperature in Celcius : %.3f",c);
	}
}