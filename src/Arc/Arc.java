package Arc;

import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;

public class Arc extends JPanelProject {

    public void circle(Graphics g) {
        g.drawArc(100, 100, 200, 200,0,360);
    }

    public void example1(Graphics g) {
        g.drawRect(50,50,400,400);
        g.drawArc(0, 0, 100, 100,270,90);
        g.drawArc(400, 0, 100, 100,180,90);
        g.drawArc(400, 400, 100, 100,90,90);
        g.drawArc(0, 400, 100, 100,0,90);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.circle(g);
        this.example1(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Arc");
        new JFrameProject(new Arc(), "Arc");
    }

}
