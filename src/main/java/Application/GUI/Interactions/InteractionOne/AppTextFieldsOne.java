package Application.GUI.Interactions.InteractionOne;

import Application.Files.InputFile;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AppTextFieldsOne extends JTextField {

    private final JTextField jTextField;



    public AppTextFieldsOne(JTextField jTextField) {
        this.jTextField = jTextField;

        setJTextField();
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    private void setJTextField() {
        jTextField.setBounds(100, 10, 300, 20);
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
