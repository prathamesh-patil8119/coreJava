class Tile{
    public int length;
 
    Tile(int l){
        length = l;
    }
}

class Floor extends Tile{
    public int width;

    Floor(int w){
        width = w;
    }

    void totalTiles(Tile t){
        Tile area = super.length * width;
        System.out.println("The Area = "+area);
    }
}

class Assignment42{
    public static void main(String args[]){
        Tile t = new Tile(10);
 
        Floor f = new Floor(5);

        f.totalTiles(t);
    }
}