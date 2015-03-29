import Lyrics.Content;
import Lyrics.Verse;

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

        System.out.println("Creating Content");
        Content c1 = new Content("Content for verse one");
        Verse v1 = new Verse(c1);

        System.out.println("Creating Content");
        Content c2 = new Content("Content for verse two");
        Verse v2 = new Verse(c2);

        System.out.println("Creating Song");
        Song s = new Song();
        s.addPart(v1);
        s.addPart(v2);

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
