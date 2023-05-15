package Application.GUI.Visibility;

import javax.swing.*;

public class Signature extends JLabel {

    private final JLabel jLabel;

    public Signature(JLabel jLabel) {
        this.jLabel = jLabel;

        setJLabel();
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    private void setJLabel() {
        jLabel.setText("Създадено то:" + "\nЛюбомир Стефанов Димов");
    }
}
