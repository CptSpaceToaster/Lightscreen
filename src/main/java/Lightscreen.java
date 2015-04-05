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
//        new OpenGLTest();
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

        System.out.println("Creating Song");
        Song s = new Song();
        s.setLyric("A duck walked up to a lemonade stand\n" + "and he said to the man running the stand\n" + "Hey. got any grapes?", "chorus1");
        s.setLyric("When the duck walked up to the lemonade stand\n" + "And he said to the man that was running the stand\n" + "Hey.  You got any glue?", "chorus2");
        s.setLyric("The man said no we just sell lemonade.  It’s cold and its fresh and it’s all home made.  Can I sell you glass? The duck said “I’ll pass”.\n"
                + "Then he waddled away.  Till the very next day.", "verse1");
        s.setLyric("The man said no, like I said yesterday, we just sell lemonade okay?\n" + "Why not give it a try?   The duck said Goodbye.\n"
                + "Then he waddled away.  He waddled away.  He waddled away\n" + "Till the very next day.", "verse2");
        s.setLyric(
                "The man said look, this is getting old.  Lemonade’s all we’ve ever sold. Why not give it a go?   The duck said “No.”\n" + "Then he waddled away.  He waddled away.  He waddled away\n"
                        + "Till the very next day.", "verse3");
        s.setLyric("The man said THAT’S IT!!  If you don’t stay away,duck,  I’ll glue you to a tree and leave you there all day, stuck.\n" + "So don’t get to close!  The duck said Adios.\n"
                + "Then he waddled away.  He waddled away.  He waddled away\n" + "Till the very next day.", "verse4");
        s.setLyric("What?\n" + "You got any glue?\n" + "No, why would I– Oh!\n" + "Then one more question for you:\n" + "Got any grapes?", "refrain");

        s.addLyric("verse1", "chorus1", "verse2", "chorus1", "verse3", "chorus1", "verse4", "chorus2", "refrain");

        System.out.println("Saving Song 1");
        IO.save(s, "song1.txt");

        System.out.println("Loading Song 1 into Song 2");
        Song song2 = IO.load("song1.txt");

        System.out.println("Adding verse1 to the end");
        song2.addLyric("verse1");

        System.out.println("Saving Song 2");
        IO.save(song2, "song2.txt");
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
