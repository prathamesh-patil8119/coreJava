import java.util.*;
class Assignment22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int arr1[] = new int[num];

		for(int i=0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		for(int i=arr.length-1; i>=0; i--){
			for(int j=i; j <= i; j++){
				arr1[j] = arr[i];
				System.out.println(arr[j]);
			}			
		}
	}
}