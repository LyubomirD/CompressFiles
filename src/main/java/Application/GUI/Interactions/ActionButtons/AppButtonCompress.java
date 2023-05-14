package Application.GUI.Interactions.ActionButtons;

import Application.GUI.Interactions.InteractionS.InteractionInput.AppTextFieldsInput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppTextFieldsOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AppButtonCompress extends AppButtonsActions {

    public AppButtonCompress(JButton jButton, AppTextFieldsInput appTextFieldsInput, AppTextFieldsOutput appTextFieldsOutput) {
        super(jButton, appTextFieldsInput, appTextFieldsOutput);

        setJButton();
    }

    @Override
    public JButton getjButton() {
        return super.getjButton();
    }

    public void setJButton() {
        getjButton().addActionListener(this);
        getjButton().setText("Компресирай");
        getjButton().setBounds(50, 170, 100, 20);
        getjButton().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        compressionMethod();
    }
}
