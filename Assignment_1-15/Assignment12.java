import java.util.Scanner;
class Assignment12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Salary: ");
		int input = sc.nextInt();
		
		if(input < 10000){
				
			float hra = input*0.10F;
			float da = input*0.90F;
			float gs = input + hra + da;
			System.out.printf("Gross Salary is : %.3f",gs);
		}
		else if(input >= 10000){
			
			int hra = 2000;
			float da = input*0.98F;
			float gs = input + hra + da;
			System.out.printf("Gross Salary is : %.3f",gs);
		}
		else{
			System.out.print("");
		}

	}
}