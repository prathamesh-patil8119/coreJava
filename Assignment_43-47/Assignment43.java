class OneBHK{
    public int roomArea;
    public int hallArea;
    public int price;

    OneBHK(){

    }
    OneBHK(int roomArea, int hallArea, int price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    void showData(){
        System.out.println("Room Area = "+roomArea+": Hall-Area = "+hallArea+": Price = "+price);
    }
}

class TwoBHK extends OneBHK{
    public int room2Area;

    TwoBHK(){

    }
    TwoBHK(int roomArea, int hallArea, int price, int room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void showData(){
        super.showData();
        double totalAmount = roomArea + hallArea + price + room2Area;
        System.out.println("Total Amount = "+totalAmount);
    }
}

class Assignment43{
    public static void main(String args[]){
       TwoBHK t1 = new TwoBHK(1000,2000,3000,4000); 
       TwoBHK t2 = new TwoBHK(5000,6000,7000,8000);
       TwoBHK t3 = new TwoBHK(9000,10000,11000,12000);
        t1.showData();
        t2.showData();
        t3.showData();
    }
}