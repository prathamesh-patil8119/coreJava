class CircleArea{
    private int radius;
    private int area;

    void init(int radius){
        this.radius = radius;
    }

    int calculateArea(){
        area = (int) 3.14 * radius * radius;
        return area;
    }

    void display(int res){
        System.out.println("The Area of a Circle is = "+area);
    }
}

class Assignment34{
    public static void main(String args[]){
        CircleArea c = new CircleArea();
        c.init(6);
        int res = c.calculateArea();
        c.display(res);
    }
}