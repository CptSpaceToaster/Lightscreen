package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class StanzaTextPane extends JTextPane {
    private StyledDocument doc = this.getStyledDocument();
    private SimpleAttributeSet set = new SimpleAttributeSet();


    public StanzaTextPane() {
        // Appearence
        // Size
        // TODO: Set Columns, but dynamically change Rows to fit
        this.setText("HELLO WORLD\n");
        // Default background color
        this.setBackground(Config.Light_Background1);

        justify_text(StyleConstants.ALIGN_CENTER);

        // Controls
        // Change background color when in focus
        this.addFocusListener(EditFocusListener.instance);

        this.setPreferredSize(new Dimension(380, 40));
    }

    public void justify_text(int justification) {
        StyleConstants.setAlignment(set, justification);
        doc.setParagraphAttributes(0, doc.getLength(), set, false);
    }

    public boolean getScrollableTracksViewportWidth()
    {
        return getUI().getPreferredSize(this).width <= getParent().getSize().width;
    }
}
