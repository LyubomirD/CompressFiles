package Application.GUI.Interactions.ActionButtons;

import Application.GUI.Interactions.InteractionS.InteractionInput.AppTextFieldsInput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppTextFieldsOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AppButtonDecompress extends AppButtonsActions {
    public AppButtonDecompress(JButton jButton, AppTextFieldsInput appTextFieldsInput, AppTextFieldsOutput appTextFieldsOutput) {
        super(jButton, appTextFieldsInput, appTextFieldsOutput);

        setJButton();
    }

    @Override
    public JButton getjButton() {
        return super.getjButton();
    }

    private void setJButton() {
        getjButton().addActionListener(this);
        getjButton().setText("Декомпресирай");
        getjButton().setBounds(250, 170, 100, 20);
        getjButton().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        decompressionMethod();
    }
}

