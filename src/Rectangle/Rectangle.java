package Rectangle;

import GraphicJava.JFrameProject;
import GraphicJava.JPanelProject;

import java.awt.*;

public class Rectangle extends JPanelProject {


    public void rectangle(Graphics g){
        g.setColor(Color.red);
        g.drawRect(20,20,300,300);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.rectangle(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Rectangle");
        // drawRect method example
        new JFrameProject(new Rectangle(), "Rectangle");

    }
}
