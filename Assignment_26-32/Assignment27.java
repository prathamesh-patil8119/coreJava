import java.util.*;
class Assignment27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements in an Array");
	
		int arr[] = new int[8];

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for(int i=0; i<arr.length; i++){

			if(max < arr[i]){
				max = arr[i];
			}

			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("Largest number is: "+max);
		System.out.println("Smallest number is: "+min);

		
	}
}