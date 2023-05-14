package Application.GUI.Interactions.InteractionS.InteractionInput;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AppTextFieldsInput extends JTextField {

    private final JTextField jTextField;



    public AppTextFieldsInput(JTextField jTextField) {
        this.jTextField = jTextField;

        setJTextField();
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    private void setJTextField() {
        checkTextChanges();
    }

    private void checkTextChanges() {
        jTextField.getDocument().addDocumentListener(new DocumentListener() {
            String text;
            @Override
            public void insertUpdate(DocumentEvent e) {
                text = jTextField.getText();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                text = jTextField.getText();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                text = jTextField.getText();
            }

        });
    }

}
