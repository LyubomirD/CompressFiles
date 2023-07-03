package Application.GUI.Visibility;

import Application.GUI.Interactions.ActionButtons.AppButtonCompress;
import Application.GUI.Interactions.ActionButtons.AppButtonDecompress;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppButtonsInput;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppLabelInput;
import Application.GUI.Interactions.InteractionS.InteractionInput.AppTextFieldsInput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppButtonsOutput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppLabelOutput;
import Application.GUI.Interactions.InteractionS.IntercationOutput.AppTextFieldsOutput;

import javax.swing.*;
import java.awt.*;

public class AppPanel extends JPanel {

    private final JPanel jPanel;
    private final AppDimensions appDimensions;
    private final AppLabelInput appLabelInput;
    private final AppTextFieldsInput appTextFieldsInput;
    private final AppLabelOutput appLabelOutput;
    private final AppButtonsInput appButtonsInput;
    private final AppButtonsOutput appButtonsOutput;
    private final AppTextFieldsOutput appTextFieldsOutput;
    private final AppButtonCompress appButtonCompress;
    private final AppButtonDecompress appButtonDecompress;
    private final FlowLayout flowLayout;
    private final Signature signature;

    public AppPanel(JPanel jPanel, AppDimensions appDimensions, AppLabelInput appLabelInput, AppTextFieldsInput appTextFieldsInput, AppButtonsInput appButtonsInput, AppLabelOutput appLabelOutput, AppTextFieldsOutput appTextFieldsOutput, AppButtonsOutput appButtonsOutput, AppButtonCompress appButtonCompress, AppButtonDecompress appButtonDecompress, FlowLayout flowLayout, Signature signature) {
        this.jPanel = jPanel;
        this.appDimensions = appDimensions;
        this.appLabelInput = appLabelInput;
        this.appTextFieldsInput = appTextFieldsInput;
        this.appLabelOutput = appLabelOutput;
        this.appButtonsInput = appButtonsInput;
        this.appButtonsOutput = appButtonsOutput;
        this.appTextFieldsOutput = appTextFieldsOutput;
        this.appButtonCompress = appButtonCompress;
        this.appButtonDecompress = appButtonDecompress;
        this.flowLayout = flowLayout;z
        this.signature = signature;

        setJPanel();
    }

    public JPanel getjPanel() {
        return jPanel;
    }

    private void setJPanel() {
        jPanel.setSize(appDimensions.getWidth(), appDimensions.getHeight());
        jPanel.setLayout(flowLayout);
        jPanel.setBackground(Color.lightGray);
        jPanel.setVisible(true);

        addComponents();
    }

    private void addComponents() {
        jPanel.add(appLabelInput.getjLabel());
        jPanel.add(appTextFieldsInput.getjTextField());
        jPanel.add(appButtonsInput.getjButton());

        jPanel.add(appLabelOutput.getjLabel());
        jPanel.add(appTextFieldsOutput.getjTextField());
        jPanel.add(appButtonsOutput.getjButton());

        jPanel.add(appButtonCompress.getjButton());
        jPanel.add(appButtonDecompress.getjButton());

        jPanel.add(signature.getjLabel());
    }

}

