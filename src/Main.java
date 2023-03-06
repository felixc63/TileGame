import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        NumberTile t1 = new NumberTile(4,3,7,4);
        NumberTile t2 = new NumberTile(6,4,3,3);
        NumberTile t3 = new NumberTile(1,2,3,4);
        NumberTile t4 = new NumberTile(3,2,5,2);
        NumberTile t5 = new NumberTile(5,9,2,2);

        ArrayList<NumberTile> tileList = new ArrayList<NumberTile>();
        tileList.add(t1);
        tileList.add(t2);
        tileList.add(t3);
        tileList.add(t4);
        tileList.add(t5);
        TileGame g = new TileGame(tileList);
        System.out.println(g);
        NumberTile t6 = new NumberTile(4,2,9,2);
        g.insertTile(t6);
        System.out.print(g);
        NumberTile t7 = new NumberTile(4,2,9,8);
        System.out.println(g.insertTile(t7));
        System.out.print(g);

    }
}