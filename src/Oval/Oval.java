package Oval;

import GraphicJava.JFrameProject;
import GraphicJava.JPanelProject;

import java.awt.*;

public class Oval extends JPanelProject {


    public void oval(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(80, 80, 200, 300);
    }

    public void circle(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(80, 80, 300, 300);
    }

    public void example3(Graphics g) {
        g.setColor(Color.decode("#B3E5FC"));
        g.fillRect(20, 20, 300, 300);
        // draw circle 1 and 2
        g.setColor(Color.decode("#03A9F4"));
        g.fillOval(20, 20, 100, 100);
        g.fillOval(220, 20, 100, 100);
        // draw circle 3
        g.setColor(Color.decode("#0288D1"));
        g.fillOval(120, 120, 100, 100);
        // draw circle 4 and 5
        g.setColor(Color.decode("#03A9F4"));
        g.fillOval(20, 220, 100, 100);
        g.fillOval(220, 220, 100, 100);
    }

    public void example4(Graphics g) {
        for (int i = 15; i <= 400; i += 10) {
            g.drawOval(40, 40, i, i);
        }
    }

    public void example5(Graphics g) {
        int x = 250;
        int y = 250;

        for (int i = 20; i <= 200; i += 10) {
            g.drawOval(x - i, y - i, i * 2, i * 2);
            g.drawRect(x - i, y - i, i * 2, i * 2);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.circle(g);
        this.oval(g);
        this.example3(g);
        this.example4(g);
        this.example5(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Oval");
        // drawOval method example
        new JFrameProject(new Oval(), "Oval");

    }

}
