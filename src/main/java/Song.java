import Lyrics.ISongPart;

import java.util.ArrayList;

public class Song {
    ArrayList<ISongPart> songContent;

    public Song() {
        songContent = new ArrayList<ISongPart>();
    }

    public Song(ArrayList<ISongPart> newContent) {
        songContent = newContent;
    }

    public Song(String filePath) {
        // TODO
    }

    public void addPart(ISongPart part) {
        songContent.add(part);
    }

    public void removePart(ISongPart part) {
        songContent.add(part);
    }

    public void readSongFromJson(String filePath) {
        // TODO
    }

    public void saveSongToJson(String filePath) {
        // TODO
    }
}
