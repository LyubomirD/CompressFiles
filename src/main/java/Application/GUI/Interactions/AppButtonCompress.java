package Application.GUI.Interactions;

import Application.Compress.CompressFile;
import Application.Files.InputFile;
import Application.Files.OutputFile;
import Application.Files.ZipOutput;
import Application.GUI.Interactions.InteractionOne.AppTextFieldsOne;
import Application.GUI.Interactions.IntercationTwo.AppTextFieldsTwo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class AppButtonCompress extends JButton implements ActionListener {

    private final JButton jButton;

    private final AppTextFieldsOne appTextFieldsOne;
    private final AppTextFieldsTwo appTextFieldsTwo;

    private CompressFile compressFile;

    public AppButtonCompress(JButton jButton, AppTextFieldsOne appTextFieldsOne, AppTextFieldsTwo appTextFieldsTwo) {
        this.jButton = jButton;
        this.appTextFieldsOne = appTextFieldsOne;
        this.appTextFieldsTwo = appTextFieldsTwo;

        setJButtonSubmit();
    }

    public JButton getjButton() {
        return jButton;
    }

    private void setJButtonSubmit() {
        jButton.addActionListener(this);
        jButton.setText("Compress");
        jButton.setBounds(50, 170, 100, 20);
        jButton.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = appTextFieldsOne.getjTextField().getText();
        String output = appTextFieldsTwo.getjTextField().getText();

        try {
            new CompressFile(
                    sentToInputStream(input),
                    sentToOutputStream(output),
                    new ZipOutput(
                            new GZIPOutputStream(
                            sentToOutputStream(output).getFileOutputStream()
                            ))
                    );
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }

    private InputFile sentToInputStream(String text) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(text);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return new InputFile(fileInputStream);
    }

    private OutputFile sentToOutputStream(String text) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(text);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return new OutputFile(fileOutputStream);
    }


}

