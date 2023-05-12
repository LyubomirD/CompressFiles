package Application.GUI.Interactions.IntercationTwo;

import Application.GUI.Interactions.InteractionOne.AppTextFieldsOne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppButtonsTwo extends JButton implements ActionListener {

    private final JButton jButton;
    private final JFileChooser jFileChooser;
    private final AppTextFieldsTwo appTextFieldsTwo;

    public AppButtonsTwo(JButton jButton, AppTextFieldsTwo appTextFieldsTwo, JFileChooser jFileChooser) {
        this.jButton = jButton;
        this.appTextFieldsTwo = appTextFieldsTwo;
        this.jFileChooser = jFileChooser;

        setJButton();
    }

    public JButton getjButton() {
        return jButton;
    }

    private void setJButton() {
        jButton.addActionListener(this);
        jButton.setText("Select File");
        jButton.setBounds(10, 90, 80, 20);
        jButton.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Select File")) {
            int result = jFileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jFileChooser.getSelectedFile();
                appTextFieldsTwo.getjTextField().setText(selectedFile.getAbsolutePath());
            }
        }
    }
}
