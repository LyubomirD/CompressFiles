package Application.GUI.Interactions.IntercationTwo;

import Application.Files.OutputFile;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AppTextFieldsTwo extends JTextField {

    private final JTextField jTextField;


    public AppTextFieldsTwo(JTextField jTextField) {
        this.jTextField = jTextField;

        setJTextField();
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    private void setJTextField() {
        jTextField.setBounds(100, 60, 300, 20);
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