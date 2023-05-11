package Application.GUI.Interaction;

import Application.GUI.Visibility.AppPanel;

import javax.swing.*;
import java.awt.*;

public class AppLabels extends JLabel {

    private final JLabel jLabel;

    public AppLabels(JLabel jLabel) {
        this.jLabel = jLabel;

        setJLabel();
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    private void setJLabel() {
        jLabel.setText("Take input here:");
        jLabel.setBounds(10, 20, 80, 25);
    }
}
