package Application.GUI.Interactions.InteractionOne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppButtonsOne extends JButton implements ActionListener {

    private final JButton jButton;
    private final JFileChooser jFileChooser;
    private final AppTextFieldsOne appTextFieldsOne;

    public AppButtonsOne(JButton jButton, AppTextFieldsOne appTextFieldsOne, JFileChooser jFileChooser) {
        this.jButton = jButton;
        this.appTextFieldsOne = appTextFieldsOne;
        this.jFileChooser = jFileChooser;

        setJButton();
    }

    public JButton getjButton() {
        return jButton;
    }

    private void setJButton() {
        jButton.addActionListener(this);
        jButton.setText("Select File");
        jButton.setBounds(10, 40, 80, 20);
        jButton.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Select File")) {
            int result = jFileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jFileChooser.getSelectedFile();
                appTextFieldsOne.getjTextField().setText(selectedFile.getAbsolutePath());
            }
        }
    }
}
