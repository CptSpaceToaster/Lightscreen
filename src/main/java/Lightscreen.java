import javax.swing.*;
import java.awt.*;

public class Lightscreen extends JFrame {
    /* GUI Stuff */
    private JPanel homePanel;

    /**
     * Main method to be called externally. Creates an instance of
     * Lightscreen, which starts off this carnival ride!
     *
     * @param args Command Line Arguments... currently unused
     */
    public static void main(String[] args) {
        new Lightscreen();
    }

    private Lightscreen() {
        createElements();
        addElements();

        // Removes the TitleBar, the X, minimize, and maximize buttons
        // setUndecorated(true);
        // getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        // The X doesn't exist any more, but I set the default close operation anyways...
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Transparent JFrame Background
        // setBackground(new Color(0,0,0,0));

        // Frame Size
        setSize(600, 400);

        // Start window in the center of the main screen
        setLocationRelativeTo(null);

        // We should probably display this thing
        setVisible(true);

        System.out.println("Hello World");

        System.out.println("Creating Lyric 1");
        Lyric l1 = new Lyric("Words for first verse", "verse1");
        System.out.println("Creating Lyric 2");
        Lyric l2 = new Lyric("Words for second verse", "verse2");
        System.out.println("Creating Lyric 3");
        Lyric l3 = new Lyric("chorus", "chorus1");

        System.out.println("Creating Song");
        Song s = new Song();
        s.appendLyric(l1);
        s.appendLyric(l3);
        s.appendLyric(l2);
        s.appendLyric(l3);

        System.out.println("Saving Song");
        s.saveSongToJson("C:\\song1.txt");
    }

    /**
     * Make and configure things
     */
    private void createElements() {
        homePanel = new JPanel();
        homePanel.setBackground(new Color(28, 28, 28));
    }

    /**
     * Put the things in other things
     */
    private void addElements() {
        // Add the Frame's panel to the frame
        add(homePanel);
    }
}
