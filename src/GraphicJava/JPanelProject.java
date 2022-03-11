package GraphicJava;

import javax.swing.JPanel;
import java.awt.*;

public class JPanelProject extends JPanel {

    int with = 500;
    int height = 500;
    String title = "1";

    public JPanelProject() {
        this.setPreferredSize(new Dimension(this.with,this.height));
    }

    public void setWith(int with) {
        this.with = with;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
