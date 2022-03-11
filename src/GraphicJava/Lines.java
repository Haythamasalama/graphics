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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.rectangle(g);
        this.triangle(g);
        this.hLetters(g);
    }
}
