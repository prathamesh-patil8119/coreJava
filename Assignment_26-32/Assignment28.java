import java.util.*;
class Assignment28{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
		int n = 5;
		String s[] = new String[n];
	
		for(int i=0; i<s.length; i++){
			s[i] = sc.next();
		}

		for(String str : s){
			System.out.println(str);
		}
	}
}