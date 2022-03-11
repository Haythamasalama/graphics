package Oval;
import GraphicJava.JFrameProject;
import GraphicJava.JPanelProject;
import java.awt.*;
public class Oval  extends JPanelProject {
    public void oval(Graphics g){
        g.setColor(Color.red);
        g.drawOval(80,80,200,300);
    }
    public void circle(Graphics g){
        g.setColor(Color.red);
        g.drawOval(80,80,300,300);
    }
}
