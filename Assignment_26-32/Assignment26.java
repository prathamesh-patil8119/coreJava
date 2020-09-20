import java.util.*;
class Assignment26{
	public static void main(String args[]){
		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6,7,8};
		int arr3[] = {9,10,11};
		int arr4[] = {12,13,14};
		int arr5[] = {15,16,17};

		int a[][] = new int[5][];

		a[0] = arr1;
		a[1] = arr2;
		a[2] = arr3;
		a[3] = arr4;
		a[4] = arr5;
		int sum=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				sum = sum + a[i][j];
			}
		}
		System.out.print("The Sum of all Elements is: "+sum);
	}
}