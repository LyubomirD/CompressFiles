package Application.GUI.Visibility;

import Application.GUI.Interaction.AppLabels;
import Application.GUI.Visibility.AppDimensions;

import javax.swing.*;
import java.awt.*;

public class AppPanel extends JPanel {

    private final JPanel jPanel;
    private final AppDimensions appDimensions;
    private final AppLabels appLabels;

    public AppPanel(JPanel jPanel, AppDimensions appDimensions, AppLabels appLabels) {
        this.jPanel = jPanel;
        this.appDimensions = appDimensions;
        this.appLabels = appLabels;

        addComponents();
    }

    private void addComponents() {
        jPanel.add(appLabels.getjLabel());
        setJPanel();
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
