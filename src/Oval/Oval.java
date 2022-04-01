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

    public void example6(Graphics g) {
        g.drawLine(250,0,250,500);
        g.drawLine(0,250,500,250);
        g.drawOval(150,150,200,200);
        g.drawOval(150,150,200,200);
    }

    public void example7(Graphics g) {
        g.setColor(new Color(102,51,0));
        g.fillRect(250,250,20,90);
        g.setColor(Color.green);
        g.fillOval(225,150,60,120);
    }

    public void example8(Graphics g) {
        g.setColor(Color.cyan);
        g.drawLine(200, 200, 300, 200);
        g.drawLine(200, 200, 150, 300);
        g.drawLine(300, 200, 350, 300);
        g.drawLine(200, 400, 300, 400);
        g.drawLine(350, 300, 300, 400);
        g.drawLine(150, 300, 200, 400);
        g.setColor(Color.pink);
        g.drawLine(150, 300, 350, 300);
        g.drawLine(300, 200, 200, 400);
        g.drawLine(200, 200, 300, 400);
        g.setColor(Color.red);
        g.fillOval(195, 195, 15, 15);
        g.fillOval(295, 195, 15, 15);
        g.fillOval(145, 295, 15, 15);
        g.fillOval(345, 295, 15, 15);
        g.fillOval(195, 395, 15, 15);
        g.fillOval(295, 395, 15, 15);
        g.fillOval(245, 295, 15, 15);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.circle(g);
        this.oval(g);
        this.example3(g);
        this.example4(g);
        this.example5(g);
        this.example6(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Oval");
        // drawOval method example
        new JFrameProject(new Oval(), "Oval");

    }

}
