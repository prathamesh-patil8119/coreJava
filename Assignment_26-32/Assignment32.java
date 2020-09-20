class StudentDemo{
	private int rno;
	private String name;
	private static int total;

	void setData(int r,String n, int t){
		rno = r;
		name = n;
		total = t;
	}

	void showData(){
		System.out.println("Roll no: "+rno+" Name: "+name+" Total: "+total);

	}
}

class Assignment32{
	public static void main(String args[]){
		StudentDemo s1 = new StudentDemo();
		s1.setData(75,"Pratham",1);
		s1.showData();
	
		StudentDemo s2 = new StudentDemo();
		s2.setData(35,"Dipesh",2);
		s1.showData();
		s2.showData();

		StudentDemo s3 = new StudentDemo();
		s3.setData(13,"Akshay",3);
		s1.showData();
		s2.showData();
		s3.showData();

		StudentDemo s4 = new StudentDemo();
		s4.setData(70,"Onkar",4);
		s1.showData();
		s2.showData();
		s3.showData();
		s4.showData();
	}
}