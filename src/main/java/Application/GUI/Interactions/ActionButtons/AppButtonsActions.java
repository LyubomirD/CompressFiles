package Application.GUI.Interactions.ActionButtons;

import Application.Compress.CompressFile;
import Application.Decompress.DecompressFile;
import Application.Files.InputFile;
import Application.Files.OutputFile;
import Application.Files.ZipInput;
import Application.Files.ZipOutput;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppTextFieldsInput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppTextFieldsOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

abstract class AppButtonsActions extends JButton implements ActionListener {
    private final JButton jButton;
    private final AppTextFieldsInput appTextFieldsInput;
    private final AppTextFieldsOutput appTextFieldsOutput;

    public AppButtonsActions(JButton jButton, AppTextFieldsInput appTextFieldsInput, AppTextFieldsOutput appTextFieldsOutput) {
        this.jButton = jButton;
        this.appTextFieldsInput = appTextFieldsInput;
        this.appTextFieldsOutput = appTextFieldsOutput;
    }

    public JButton getjButton() {
        return jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void compressionMethod() {
        String input = appTextFieldsInput.getjTextField().getText();
        String output = appTextFieldsOutput.getjTextField().getText();
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

    public void decompressionMethod() {
        String input = appTextFieldsInput.getjTextField().getText();
        String output = appTextFieldsOutput.getjTextField().getText();
        try {
            new DecompressFile(
                    sentToInputStream(input),
                    sentToOutputStream(output),
                    new ZipInput(
                            new GZIPInputStream(
                                    sentToInputStream(input).getFileInputStream()
                            ))
            );
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    private InputFile sentToInputStream(String text) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(text);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return new InputFile(fileInputStream);
    }

    private OutputFile sentToOutputStream(String text) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(text);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        return new OutputFile(fileOutputStream);
    }

}
