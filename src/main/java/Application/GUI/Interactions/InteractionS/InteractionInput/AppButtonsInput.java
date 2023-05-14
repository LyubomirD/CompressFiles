package Application.GUI.Interactions.InteractionS.InteractionInput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppButtonsInput extends JButton implements ActionListener {

    private final JButton jButton;
    private final JFileChooser jFileChooser;
    private final AppTextFieldsInput appTextFieldsInput;

    public AppButtonsInput(JButton jButton, AppTextFieldsInput appTextFieldsInput, JFileChooser jFileChooser) {
        this.jButton = jButton;
        this.appTextFieldsInput = appTextFieldsInput;
        this.jFileChooser = jFileChooser;

        setJButton();
    }

    public JButton getjButton() {
        return jButton;
    }

    private void setJButton() {
        jButton.addActionListener(this);
        jButton.setText("Избери входящ файл");
        jButton.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Избери входящ файл")) {
            int result = jFileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jFileChooser.getSelectedFile();
                appTextFieldsInput.getjTextField().setText(selectedFile.getAbsolutePath());
            }
        }
    }
}
