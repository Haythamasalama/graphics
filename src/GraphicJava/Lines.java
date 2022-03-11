package GraphicJava;

import java.awt.*;

public class Lines extends JPanelProject {

    public void rectangle(Graphics g){
        g.setColor(Color.red);
        g.drawLine(10,10,200,10);
        g.drawLine(10,10,10,200);
        g.drawLine(10,200,200,200);
        g.drawLine(200,10,200,200);
    }
}
