import java.util.Scanner;
class Assignment13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
/*	Using If Else Condition

		if(a > b){
			if(a > c){
				
				System.out.print(a+" is greater");
			}
			else if(c > a){
				
				System.out.print(c+" is greater");
			}
		}

		else if(b > a){
			if(b > c){
				
				System.out.print(b+" is greater");
			}
			else if(c > b){
				
				System.out.print(c+" is greater");
			}
		}

		else{
			
			System.out.print(c+" is greater");
		}
*/

	//	Using Ternary Operator	
	
		int res = (a>b && a>c) ? a : (b>a && b>c) ? b : c;
		System.out.print(res+" is greatest");
	}
}