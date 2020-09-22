class ThisConstruct{
    public int i;
    public int j;
    public int k;

    ThisConstruct(){
        this(10,20,30);
        System.out.println("Zero Parameter Constructor : ");
    }

    ThisConstruct(int i, int j, int k){
        System.out.println("Parameterized Constructor Called : ");
    }
}

class Assignment41{
    public static void main(String args[]){
        ThisConstruct t = new ThisConstruct();       
    }
}