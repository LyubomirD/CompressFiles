package Application.GUI.Visibility;

import Application.GUI.Interactions.AppButtonCompress;
import Application.GUI.Interactions.AppButtonDecompress;
import Application.GUI.Interactions.InteractionOne.AppButtonsOne;
import Application.GUI.Interactions.InteractionOne.AppLabelOne;
import Application.GUI.Interactions.InteractionOne.AppTextFieldsOne;
import Application.GUI.Interactions.IntercationTwo.AppButtonsTwo;
import Application.GUI.Interactions.IntercationTwo.AppLabelTwo;
import Application.GUI.Interactions.IntercationTwo.AppTextFieldsTwo;

import javax.swing.*;
import java.awt.*;

public class AppPanel extends JPanel {

    private final JPanel jPanel;
    private final AppDimensions appDimensions;
    private final AppLabelOne appLabelOne;
    private final AppTextFieldsOne appTextFieldsOne;
    private final AppLabelTwo appLabelTwo;
    private final AppButtonsOne appButtonsOne;
    private final AppButtonsTwo appButtonsTwo;
    private final AppTextFieldsTwo appTextFieldsTwo;
    private final AppButtonCompress appButtonCompress;
    private final AppButtonDecompress appButtonDecompress;

    public AppPanel(JPanel jPanel, AppDimensions appDimensions, AppLabelOne appLabelOne, AppTextFieldsOne appTextFieldsOne, AppButtonsOne appButtonsOne, AppLabelTwo appLabelTwo, AppTextFieldsTwo appTextFieldsTwo, AppButtonsTwo appButtonsTwo, AppButtonCompress appButtonCompress, AppButtonDecompress appButtonDecompress) {
        this.jPanel = jPanel;
        this.appDimensions = appDimensions;
        this.appLabelOne = appLabelOne;
        this.appTextFieldsOne = appTextFieldsOne;
        this.appLabelTwo = appLabelTwo;
        this.appButtonsOne = appButtonsOne;
        this.appButtonsTwo = appButtonsTwo;
        this.appTextFieldsTwo = appTextFieldsTwo;
        this.appButtonCompress = appButtonCompress;
        this.appButtonDecompress = appButtonDecompress;

        addComponents();
    }

    private void addComponents() {
        setJPanel();
        jPanel.add(appLabelOne.getjLabel());
        jPanel.add(appTextFieldsOne.getjTextField());
        jPanel.add(appButtonsOne.getjButton());
        jPanel.add(appLabelTwo.getjLabel());
        jPanel.add(appTextFieldsTwo.getjTextField());
        jPanel.add(appButtonsTwo.getjButton());
        jPanel.add(appButtonCompress.getjButton());
        jPanel.add(appButtonDecompress.getjButton());
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    private void setJPanel() {
        jPanel.setSize(appDimensions.getWidth(), appDimensions.getHeight());
        jPanel.setLayout(null);
        jPanel.setBackground(Color.GRAY);
        jPanel.setVisible(true);
    }
}
