class Assignment3{
	public static void main(String args[]){
		int x = 5;
		int y = x * x + 3 * x - 7;
		System.out.println(y);

		y = x++ + ++x;
		System.out.println(x + " "+y);

		int z = x++ - --y - --x + x++;
		System.out.println(x + " "+y + " "+z);

		boolean x1 = true;
		boolean y1 = false;
		boolean z1 = (x1 && y1 || !(x1 || y1));
		System.out.println(z1);
	}
}