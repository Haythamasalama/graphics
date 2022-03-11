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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.circle(g);
        this.oval(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Oval");
        // drawOval method example
        new JFrameProject(new Oval(), "Oval");

    }

}
