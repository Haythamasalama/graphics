package HomeWorks;
import java.awt.*;
import javax.swing.*;

class LineDrawing extends JPanel
{
    public void paint(Graphics g){
        g.drawLine(50,50,100,100);
    }
}

class CircleDrawing extends JPanel
{
    public void paint(Graphics g){
        g.drawOval(20,20,100,100);
    }
}

class RectangleDrawing extends JPanel
{
    public void paint(Graphics g){
        g.drawRect(50,50,200,100);
    }
}


public class HomeWork2  extends JFrame{
    JTabbedPane pane;

    public  HomeWork2()
    {
       add(pane  = new  JTabbedPane());

        pane.addTab("Car" ,new LineDrawing());
        pane.addTab("Balls" ,new CircleDrawing());
        pane.addTab("Any other Shape" ,new RectangleDrawing());

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new HomeWork2();

    }
}


