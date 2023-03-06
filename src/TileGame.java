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
       return -1;
    }

    public boolean insertTile(NumberTile tile)
    {
        return false;
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
