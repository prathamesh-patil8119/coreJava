import java.util.Scanner;
class Assignment15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Gender: ");
		char gender = sc.next().charAt(0);

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		if(gender == 'M'){
			if(age >= 22){
				System.out.println("Eligible for marriage");
			}
			else{
				System.out.println("Not Eligible for marriage");
			}	
		}
		else if(gender == 'F'){
			if(age >= 18){
				System.out.println("Eligible for marriage");
			}
			else{
				System.out.println("Not Eligible for marriage");
			}
		}
	}
}