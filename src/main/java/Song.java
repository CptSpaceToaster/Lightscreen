import Lyrics.ISongPart;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import java.io.*;
import java.util.ArrayList;

public class Song {
    ObjectWriter mapper = new ObjectMapper().writer().withDefaultPrettyPrinter();
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
        try {
            // TODO: Move away from absolute path?  Or should I move this to C://Program Files, etc
            mapper.writeValue(new File(filePath), songContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
