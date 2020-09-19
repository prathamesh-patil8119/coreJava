import java.util.Scanner;
class Assignment18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		int num = sc.nextInt();
		
		int flag = 0;
		if(num == 0 || num == 1 || num == 2){
			System.out.println("Prime");
		}
		else{
			for(int i=2; i<=num/2; i++){
				if(num%i == 0){
				System.out.println("Not Prime");
				flag = 1;
				num++;
				break;
				}
			}
			if(flag == 0){
			System.out.println("Prime");
			}
		}

	}
}