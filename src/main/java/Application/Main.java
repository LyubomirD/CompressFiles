package Application;

import Application.GUI.Interactions.ActionButtons.AppButtonCompress;
import Application.GUI.Interactions.ActionButtons.AppButtonDecompress;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppButtonsInput;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppLabelInput;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppTextFieldsInput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppButtonsOutput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppLabelOutput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppTextFieldsOutput;
import Application.GUI.Visibility.AppDimensions;
import Application.GUI.Visibility.AppFrame;
import Application.GUI.Visibility.AppPanel;
import Application.GUI.Visibility.Signature;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        AppDimensions dimensions = new AppDimensions(280, 300);

        AppLabelInput appLabelInput = new AppLabelInput(new JLabel());
        AppTextFieldsInput appTextFieldsInput = new AppTextFieldsInput(new JTextField(20));
        AppButtonsInput appButtonsInput = new AppButtonsInput(new JButton(), appTextFieldsInput, new JFileChooser());

        AppLabelOutput appLabelOutput = new AppLabelOutput(new JLabel());
        AppTextFieldsOutput appTextFieldsOutput = new AppTextFieldsOutput(new JTextField(20));
        AppButtonsOutput appButtonsOutput = new AppButtonsOutput(new JButton(), appTextFieldsOutput, new JFileChooser());

        AppButtonCompress appButtonCompress = new AppButtonCompress(new JButton(), appTextFieldsInput, appTextFieldsOutput);
        AppButtonDecompress appButtonDecompress = new AppButtonDecompress(new JButton(), appTextFieldsInput, appTextFieldsOutput);

        Signature signature = new Signature(new JLabel());

        AppPanel appPanel = new AppPanel(
                new JPanel(),
                dimensions,
                appLabelInput,
                appTextFieldsInput,
                appButtonsInput,
                appLabelOutput,
                appTextFieldsOutput,
                appButtonsOutput,
                appButtonCompress,
                appButtonDecompress,
                new FlowLayout(),
                signature
        );
        new AppFrame(new JFrame(), appPanel, dimensions);
    }
}

