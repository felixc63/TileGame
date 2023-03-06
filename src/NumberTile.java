public class NumberTile {
    //This could have been an array or ArrayList - I just went with the first idea
    //that came into my head.  This causes troubles for me throughout the class.
    int top;
    int right;
    int bottom;
    int left;


    //See? An array in particular would have made this a little nicer.
    //though array is less readable.  We get a builtin reminder of
    //what each instance variable is.
    public NumberTile(int top, int right, int bottom, int left)
    {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }
    /** Rotates the tile 90 degrees clockwise
     *  Again: array or ArrayList.  ArrayList in particular would have made this
     *  easy.  This could have been done with one temp and three swaps.  Again: readability
     **/
    public void rotate()
    {
        int tempTop = top;
        int tempRight = right;
        int tempBottom = bottom;
        int tempLeft = left;
        top = tempLeft;
        right = tempTop;
        bottom = tempRight;
        left = tempBottom;
    }
    /** @return value at left edge of the tile */
    public int getLeft()
    {
       return left;
    }

    /** @return falue at the right edge of the tile */
    public int getRight()
    {
        return right;
    }

    /** Added these so we can implement*/
    public int getTop()
    {
        return top;
    }
    public int getBottom()
    {
        return bottom;
    }
    public String toString()
    {
        String str = " "+top+" "+"\n";
        str += left+" "+right+"\n";
        str += " "+bottom+" "+"\n";
        return str;
    }
}
