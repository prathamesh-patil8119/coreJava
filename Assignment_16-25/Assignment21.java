import java.util.*;
class Assignment21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values inside Array: ");
		int arr[] = new int[10];
		int sum=0;
		for(int i=0; i < arr.length; i++){
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		float avg = sum/arr.length;
		System.out.printf("The Average is: %.3f",avg);
	}
}