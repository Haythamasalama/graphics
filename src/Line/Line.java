package Line;


import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;

public class Line extends JPanelProject {


    public void rectangle(Graphics g){
        g.setColor(Color.red);
        g.drawLine(10,10,200,10);
        g.drawLine(10,10,10,200);
        g.drawLine(10,200,200,200);
        g.drawLine(200,10,200,200);
    }

    public void triangle(Graphics g){
        g.setColor(Color.red);
        g.drawLine(10,10,200,300);
        g.drawLine(200,300,10,300);
        g.drawLine(10,10,10,300);
    }

    public void hLetters(Graphics g){
        g.setColor(Color.red);
        g.drawLine(10,10,10,300);
        g.drawLine(10,150,200,150);
        g.drawLine(200,150,200,300);
    }

    public void example5(Graphics g){
        g.setColor(Color.red);
        int x ,y ,r = 100, xc = 250 , yc = 250;
        g.drawLine(250,0,250,500);
        g.drawLine(0,250,500,250);

        for (int a=0 ; a<= 360 ;a++){
            x = (int) Math.round(r* Math.cos((a * Math.PI)/180));
            y = (int) Math.round(r* Math.sin((a * Math.PI)/180));
            g.drawLine(xc + x, yc - y, xc + x, yc - y);
        }
    }

    public void example6(Graphics g){
        g.drawLine( 150,100,250,100);
        g.drawLine( 150,100,100,200);
        g.drawLine( 250,100,300,200);
        g.drawLine( 150,300,250,300);
        g.drawLine( 300,200,250,300);
        g.drawLine( 100,200,150,300);
        g.drawLine( 100,200,300,200);
        g.drawLine( 200,100,200,300);
        g.drawLine( 250,100,150,300);
        g.drawLine( 150,100,250,300);
    }

    /**
     * draw sin fn
     * y = a * sin( b * x)
     * a => amplitude ( 1 )
     * b => period (90 => 1 )
     */
    public void sin(Graphics g) {
        int xc = 50, yc = 250;
        // draw horizontal and verticals line
        g.drawLine(xc, 0, xc, getHeight());
        g.drawLine(0, yc, getWidth(), yc);
        // cal for 360 degree
        for (int x = 0; x <= 360; x++) {
            int y = (int) (90 * Math.sin(Math.PI * x / 180));
            g.drawLine(xc + x, yc - y, xc + x, yc - y);
        }
        // or cal for 90 degree
        for (int x = 0; x <= 90; x++) {
            int y = (int) (90 * Math.sin(Math.PI * x / 180));
            g.setColor(Color.red);
            g.drawLine(xc + x, yc - y, xc + x, yc - y);
            g.setColor(Color.black);
            g.drawLine(xc + 180 - x, yc - y, xc + 180 - x, yc - y);
            g.setColor(Color.orange);
            g.drawLine(xc + 180 + x, yc + y, xc + 180 + x, yc + y);
            g.setColor(Color.green);
            g.drawLine(xc + 360 - x, yc + y, xc + 360 - x, yc + y);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.rectangle(g);
        this.triangle(g);
        this.hLetters(g);
        this.example5(g);
        this.example6(g);
        this.sin(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> lines");
        // drawLine method example
        new JFrameProject(new Line(), "lines");
    }
}
