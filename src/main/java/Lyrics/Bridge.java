package Lyrics;

public class Bridge extends ISongPart {
    // The instance number.  Bridge1, Bridge2, etc
    private int index;

    // Private static, for keeping track of index
    private static int count;

    public Bridge(Content newBridge) {
        super(newBridge);
        index = count++;
    }

    @Override
    public int getSortOrder() {
        return index;
    }
}
