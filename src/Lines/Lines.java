package Lines;


import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;

public class Lines extends JPanelProject {


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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.rectangle(g);
        this.triangle(g);
        this.hLetters(g);
        this.example5(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> lines");
        // drawLine method example
        new JFrameProject(new Lines(), "lines");
    }
}
