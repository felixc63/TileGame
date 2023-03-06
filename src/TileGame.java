import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame()
    {
        board = new ArrayList<NumberTile>();
    }

    //Added this so we can have a new examples to check our work
    public TileGame(ArrayList<NumberTile> tileList)
    {
        board = tileList;
    }

    private int getIndexForFit(NumberTile tile)
    {
        if ((this.board.size() == 0) ||
                (tile.getRight() == this.board.get(0).getLeft()))
            return 0;
        for (int i = 1; i < this.board.size(); i++)
        {
            if (tile.getLeft() == this.board.get(i-1).getRight() &&
                    tile.getRight() == this.board.get(i).getLeft())
                return i;
        }
        if (tile.getLeft() == this.board.get(this.board.size() - 1).getRight())
            return this.board.size();
        return -1;
    }

    public boolean insertTile(NumberTile tile)
    {
        int index = getIndexForFit(tile);
        System.out.println("index = "+index);
        int test = 1;
        System.out.println(tile);
        while (index == -1 && test < 4)
        {
            tile.rotate();
            System.out.println(tile);
            index = getIndexForFit(tile);
            System.out.println("index = "+index);
            test++;
        }
        if (index != -1)
            this.board.add(index, tile);
        return (index != -1);
    }
    public String toString()
    {
        String retStr = "";
        for (int i = 0; i < board.size(); i++)
        {
            retStr += " "+board.get(i).getTop()+"  ";
        }
        retStr += "\n";
        for (int i = 0; i < board.size(); i++)
        {
            retStr += board.get(i).getLeft()+" "+board.get(i).getRight()+" ";
        }
        retStr += "\n";
        for (int i = 0; i < board.size(); i++)
        {
            retStr += " "+board.get(i).getBottom()+"  ";
        }
        retStr += "\n";
        return retStr;
    }
}
