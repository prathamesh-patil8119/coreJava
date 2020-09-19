import java.util.Scanner;
class Assignment20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first value: ");
		int first = sc.nextInt();
		System.out.print("Enter last value: ");
		int last = sc.nextInt();
		
		for(int i=first; i <= last-1; i++){
		int flag=0;
			for(int j=2; j<i; j++){
				if(i%j == 0){
					flag = 1;
					break;
				}
			}
			if(flag==0){
				System.out.println(i);
			}
		}

	}
}