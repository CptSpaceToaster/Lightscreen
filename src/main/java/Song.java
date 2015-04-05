import java.util.ArrayList;
import java.util.TreeMap;

// TODO: Formatting

public class Song {
    // TODO: What kind of dictionary should I use?
    public TreeMap<String, String> songContent;
    public ArrayList<String> songOrder;

    public Song() {
        songContent = new TreeMap<String, String>();
        songOrder = new ArrayList<>();
    }

    public void setLyric(String lyric, String key) {
        if (!songContent.containsKey(key)) {
            songContent.put(key, lyric);
        }
    }
    public void addLyric(String... keys) {
        for (String key : keys) {
            if (songContent.containsKey(key)) {
                songOrder.add(key);
            }
        }
    }

    // TODO: prependLyric, insertLyricAtIndex

    public void removeFirstLyric(String part) {
        // TODO:
    }

    // TODO: removeLastLyric, removeLyricAtIndex

    public void readSongFromJson(String filePath) {
        // TODO:
    }
}
