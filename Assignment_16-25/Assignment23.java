import java.util.*;
class Assignment23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array: ");
		
		int arr[] = new int[5];

		for(int i=0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter An Element to Search: ");
		int key = sc.nextInt();
		
		int flag=0;
		for(int i=0; i < arr.length; i++){
			if(arr[i] == key){
				System.out.println(key+" The Element is found:");
				flag=1;
				break;
				
			}
		}
		if(flag==0){
			System.out.print(key+" Element not found");
		}
	}
}