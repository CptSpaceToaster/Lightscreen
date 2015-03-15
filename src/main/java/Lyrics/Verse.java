package Lyrics;

public class Verse extends ISongPart {
    // The instance number.  Verse1, Verse2, etc
    private int index;

    // Private static, for keeping track of index
    private static int count;

    public Verse(Content newVerse) {
        super(newVerse);
        index = count++;
    }

    @Override
    public int getSortOrder() {
        return index;
    }

    @Override
    public Class getType() {
        return null;
    }
}
