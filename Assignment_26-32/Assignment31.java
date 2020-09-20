class Student{
	private int rno;
	private String name;

	void setData(int r,String n){
		rno = r;
 		name = n;
	}
	
	void showData(){
		System.out.println("Roll Number: "+rno);
		System.out.print("Name is: "+name);
	}
}

class Assignment31{
	public static void main(String args[]){
		Student s = new Student();
		s.setData(88,"Karnik");
		s.showData();
	}
}