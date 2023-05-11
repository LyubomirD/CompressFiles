package Application.GUI.Visibility;

import javax.swing.*;

public class AppFrame extends JFrame {

    private final JFrame jFrame;
    private final AppPanel appPanel;
    private final AppDimensions appDimensions;


    public AppFrame(JFrame jFrame, AppPanel appPanel, AppDimensions appDimensions) {
        this.jFrame = jFrame;
        this.appPanel = appPanel;
        this.appDimensions = appDimensions;

        addComponents();
    }

    private void addComponents() {
        setJFrame();
        jFrame.add(appPanel.getjPanel());
    }

    private void setJFrame() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Compressor");
        jFrame.pack();
        jFrame.setSize(appDimensions.getWidth(), appDimensions.getHeight());
        jFrame.setResizable(false);
        jFrame.setAlwaysOnTop(true);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

}


