import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Dictionary;

// TODO: Formatting

public class Song {
    private ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();

    // TODO: What kind of dictionary should I use?
    //public Dictionary<Lyric, String> songContent;
    public ArrayList<String> songOrder;

    public Song() {
        //songContent = new Dictionary<Lyric, String>();
        songOrder = new ArrayList<>();
    }

    public Song(String filePath) {
        // TODO:
    }

    public void appendLyric(Lyric lyric) {
        /*if (!songContent.containsKey(lyric.getID())) {
            songContent.put(lyric, lyric.getID());
        }*/
        songOrder.add(lyric.getID());
    }

    // TODO: prependLyric, insertLyricAtIndex

    public void removeFirstLyric(Lyric part) {
        // TODO:
    }

    // TODO: removeLastLyric, removeLyricAtIndex

    public void readSongFromJson(String filePath) {
        // TODO:
    }

    public void saveSongToJson(String filePath) {
        try {
            // TODO: Move away from absolute path?  Or should I move this to C://Program Files, etc
            // I think the local running path would be best
            mapper.writeValue(new File(filePath), this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
