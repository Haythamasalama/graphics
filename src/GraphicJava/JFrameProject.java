package GraphicJava;

import javax.swing.JFrame;

public class JFrameProject extends JFrame {

    public JFrameProject(JPanelProject panel ,String title)  {
        super("graphic java" + title);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }



}
