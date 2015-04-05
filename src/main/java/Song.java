import java.io.FileNotFoundException;
import java.io.PrintWriter;
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

    public Song(String filePath) {
        // TODO:
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

    public void saveSongToJson(String filePath) {
        // I'm treating this like an API call... the GUI should hand me a valid absolute path.
        try {
            PrintWriter o = new PrintWriter(filePath);
            o.println(Lightscreen.mapper.toJson(this));
            o.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
