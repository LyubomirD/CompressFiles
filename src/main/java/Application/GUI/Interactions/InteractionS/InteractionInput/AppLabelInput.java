package Application.GUI.Interactions.InteractionS.InteractionInput;

import Application.GUI.Visibility.AppDimensions;

import javax.swing.*;
import java.awt.*;

public class AppLabelInput extends JLabel {

    private final JLabel jLabel;

    public AppLabelInput(JLabel jLabel) {
        this.jLabel = jLabel;

        setAppLabelInput();
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public void setAppLabelInput() {
        jLabel.setText("Входящ файл:");
    }
}
