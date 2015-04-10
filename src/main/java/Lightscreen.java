import javax.swing.*;


import gui.*;

import java.awt.*;

public class Lightscreen extends JFrame {
    /* GUI Stuff */
    private JPanel homePanel;
    private JPanel editPanel;
    private JScrollPane scroll;
    private JTextPane[] areas;

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

        System.out.println("Loading Song");
        Song s = IO.load("song1.txt");
        System.out.println(s.songOrder);
    }

    /**
     * Make and configure things
     */
    private void createElements() {
        homePanel = new JPanel();
        homePanel.setBackground(Config.Dark_Background1);

        editPanel = new JPanel();
        editPanel.setLayout(new BoxLayout(editPanel, BoxLayout.Y_AXIS));

        areas = new StanzaTextPane[20];
    }

    /**
     * Put the things in other things
     */
    private void addElements() {
        // Add the Frame's panel to the frame
        for (JTextPane area : areas) {
            area = new StanzaTextPane();
            editPanel.add(area);
        }

        scroll = new JScrollPane(editPanel);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(400, 360));


        homePanel.add(scroll);

        add(homePanel);

    }
}
