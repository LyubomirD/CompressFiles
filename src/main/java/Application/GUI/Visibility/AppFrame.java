package Application.GUI.Visibility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class AppFrame extends JFrame {

    private final JFrame jFrame;
    private final AppPanel appPanel;
    private final AppDimensions appDimensions;

    public AppFrame(JFrame jFrame, AppPanel appPanel, AppDimensions appDimensions) {
        this.jFrame = jFrame;
        this.appPanel = appPanel;
        this.appDimensions = appDimensions;

        addComponents();
        resizeableJFrame();
    }

    private void addComponents() {
        jFrame.add(appPanel.getjPanel());
        setJFrame();
    }

    private void setJFrame() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Compressor");
        jFrame.pack();
        jFrame.setSize(appDimensions.getWidth(), appDimensions.getHeight());
        jFrame.setResizable(true);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    private void resizeableJFrame() {
        jFrame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                Dimension newSize = jFrame.getSize();
                appDimensions.setWidth(newSize.width);
                appDimensions.setHeight(newSize.height);
                appPanel.getjPanel().setSize(appDimensions.getWidth(), appDimensions.getHeight());
            }
        });
    }


}


