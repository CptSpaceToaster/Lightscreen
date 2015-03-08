package Lyrics;

public class Chorus extends ISongPart {
    // The instance number.  Chorus1, Chorus2, etc
    private int index;

    // Private static, for keeping track of index
    private static int count;

    public Chorus(Content newChorus) {
        super(newChorus);
        index = count++;
    }

    @Override
    public int getSortOrder() {
        return index;
    }
}
