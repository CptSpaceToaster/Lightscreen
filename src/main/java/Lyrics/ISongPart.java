package Lyrics;

public abstract class ISongPart {
    // Content for the object
    public Content content;

    public ISongPart(Content newContent) {
        content = newContent;
    }

    public abstract int getSortOrder();
    public abstract Class getType();
}
