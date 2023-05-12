package Application.GUI.Interactions.IntercationTwo;

import javax.swing.*;

public class AppLabelTwo extends JLabel {

    private final JLabel jLabel;

    public AppLabelTwo(JLabel jLabel) {
        this.jLabel = jLabel;

        setAppLabelTwo();
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    private void setAppLabelTwo() {
        jLabel.setText("Output");
        jLabel.setBounds(10, 60, 150, 20);
        jLabel.setLayout(null);
    }
}

