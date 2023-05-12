package Application;

import Application.Files.OutputFile;
import Application.GUI.Interactions.AppButtonCompress;
import Application.GUI.Interactions.AppButtonDecompress;
import Application.GUI.Interactions.InteractionOne.AppButtonsOne;
import Application.GUI.Interactions.InteractionOne.AppLabelOne;
import Application.GUI.Interactions.InteractionOne.AppTextFieldsOne;
import Application.GUI.Interactions.IntercationTwo.AppButtonsTwo;
import Application.GUI.Interactions.IntercationTwo.AppLabelTwo;
import Application.GUI.Interactions.IntercationTwo.AppTextFieldsTwo;
import Application.GUI.Visibility.AppDimensions;
import Application.GUI.Visibility.AppFrame;
import Application.GUI.Visibility.AppPanel;

import javax.swing.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        AppDimensions dimensions = new AppDimensions(415, 250);

        AppLabelOne appLabelOne = new AppLabelOne(new JLabel());
        AppTextFieldsOne appTextFieldsOne = new AppTextFieldsOne(new JTextField(20));
        AppButtonsOne appButtonsOne = new AppButtonsOne(new JButton(), appTextFieldsOne, new JFileChooser());

        AppLabelTwo appLabelTwo = new AppLabelTwo(new JLabel());
        AppTextFieldsTwo appTextFieldsTwo = new AppTextFieldsTwo(new JTextField(20));
        AppButtonsTwo appButtonsTwo = new AppButtonsTwo(new JButton(), appTextFieldsTwo, new JFileChooser());

        AppButtonCompress appButtonCompress = new AppButtonCompress(new JButton(), appTextFieldsOne, appTextFieldsTwo);
        AppButtonDecompress appButtonDecompress = new AppButtonDecompress(new JButton(), appTextFieldsOne, appTextFieldsTwo);

        AppPanel appPanel = new AppPanel(new JPanel(), dimensions, appLabelOne, appTextFieldsOne, appButtonsOne, appLabelTwo,appTextFieldsTwo, appButtonsTwo, appButtonCompress, appButtonDecompress);
        AppFrame appFrame = new AppFrame(new JFrame(), appPanel, dimensions);
    }
}

