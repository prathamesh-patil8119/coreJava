import java.util.Scanner;
class Assignment9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days: ");
		int userdays = sc.nextInt();
		int years = userdays / 365;
		int months = (userdays % 365)/30;
		int days = (userdays % 365)%30;
		System.out.print("Years : "+years+" Months : "+months+" Days : "+days);
	}
}