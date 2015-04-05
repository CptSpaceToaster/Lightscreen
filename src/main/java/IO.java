import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class IO {
    private static Gson mapper = new GsonBuilder().setPrettyPrinting().create();

    public static Song load(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            return mapper.fromJson(br, Song.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void save(Song s, String filePath) {
        // I'm treating this like an API call... the GUI should hand me a valid absolute path.
        try {
            PrintWriter o = new PrintWriter(filePath);
            o.println(mapper.toJson(s));
            o.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
