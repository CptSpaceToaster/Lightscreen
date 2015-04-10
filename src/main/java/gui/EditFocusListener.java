package gui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EditFocusListener implements FocusListener {
    public static EditFocusListener instance = new EditFocusListener();

    public void focusLost(FocusEvent e) {
        e.getComponent().setBackground(Config.Light_Background1);
    }

    public void focusGained(FocusEvent e) {
        e.getComponent().setBackground(Config.Light_Background2);
    }
}
