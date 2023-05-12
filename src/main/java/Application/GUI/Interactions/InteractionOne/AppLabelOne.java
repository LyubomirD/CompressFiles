package Application.GUI.Interactions.InteractionOne;

import javax.swing.*;

public class AppLabelOne extends JLabel {

    private final JLabel jLabel;

    public AppLabelOne(JLabel jLabel) {
        this.jLabel = jLabel;

        setAppLabelOne();
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public void setAppLabelOne() {
        jLabel.setText("Input");
        jLabel.setBounds(10, 10, 150, 20);
        jLabel.setLayout(null);
    }
}
