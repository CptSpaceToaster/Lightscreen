import Lyrics.ISongPart;

import java.util.ArrayList;

public class Song {
    ArrayList<ISongPart> songContent;

    public Song(ArrayList<ISongPart> newContent) {
        songContent = newContent;
    }
}
