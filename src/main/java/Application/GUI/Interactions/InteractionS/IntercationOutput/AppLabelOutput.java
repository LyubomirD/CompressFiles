package Application.GUI.Interactions.InteractionS.IntercationOutput;

import javax.swing.*;

public class AppLabelOutput extends JLabel {

    private final JLabel jLabel;

    public AppLabelOutput(JLabel jLabel) {
        this.jLabel = jLabel;

        setAppLabelOutput();
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    private void setAppLabelOutput() {
        jLabel.setText("Изходящ файл:");
    }
}

