public class Lyric {
    // Content for the Lyric
    private String rawText = null;
    // Unique Lyric ID
    public String ID = null;

    public Lyric(String newRawText, String newID) {
        rawText = newRawText;
        ID = newID;
    }

    public String getRawText(){
        return rawText;
    }

    public String getID(){
        return ID;
    }
}
