import java.util.Scanner;
class Assignment14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Year: ");
		int year = sc.nextInt();
		
		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.print(year+" is a Leap Year");
				}
			}
			else{
				System.out.print(year+" is a Leap Year");
			}
		}
		else{
			System.out.print(year+" is not a Leap Year");
		}
	}
}