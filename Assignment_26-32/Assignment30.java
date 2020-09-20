import java.util.Scanner;
class Assignment30{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter an Element in an Array: ");
		
		int a[][] = new int[3][3];

		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<a.length; i++){
			for(int j=i; j<=i; j++){
				System.out.println(a[i][j]);
			}
			System.out.println("");
		}

	}
}