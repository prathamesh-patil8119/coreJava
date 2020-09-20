import java.util.*;
class Assignment29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int r = 5;
		int c = 4;
		int arr[][] = new int[r][c];

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int count=0;
		for(int a[] : arr){
			for(int b : a){
				System.out.print(b+" ");
			}
			count++;
			System.out.println("");
						
		}
			System.out.println("Count = "+count);
	}
}