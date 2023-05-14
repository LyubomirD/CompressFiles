package Application.GUI.Interactions.InteractionS.IntercationOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppButtonsOutput extends JButton implements ActionListener {

    private final JButton jButton;
    private final JFileChooser jFileChooser;
    private final AppTextFieldsOutput appTextFieldsOutput;

    public AppButtonsOutput(JButton jButton, AppTextFieldsOutput appTextFieldsOutput, JFileChooser jFileChooser) {
        this.jButton = jButton;
        this.appTextFieldsOutput = appTextFieldsOutput;
        this.jFileChooser = jFileChooser;

        setJButton();
    }

    public JButton getjButton() {
        return jButton;
    }

    private void setJButton() {
        jButton.addActionListener(this);
        jButton.setText("Избери изходящ файл");
        jButton.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Избери изходящ файл")) {
            int result = jFileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jFileChooser.getSelectedFile();
                appTextFieldsOutput.getjTextField().setText(selectedFile.getAbsolutePath());
            }
        }
    }
}
