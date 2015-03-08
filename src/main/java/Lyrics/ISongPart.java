package Lyrics;

public abstract class ISongPart {
    // Content for the object
    public Content content;

    public ISongPart(Content newContent) {
        content = newContent;
    }

    public String getText() {
        return content.getRawText();
    }

    public abstract int getSortOrder();
}
