import java.util.*;
class Assignment25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in an Array: ");
		
		int arr[] = new int[10];
		int sumEven=0;
		int sumOdd=0;

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();

			if(arr[i]%2 == 0){
				sumEven+=arr[i];
			}
			else{
				sumOdd+=arr[i];
			}
		}
		System.out.println("The Sum of all even Numbers is: "+sumEven);
		System.out.println("The Sum of all odd Numbers is: "+sumOdd);
	}
}