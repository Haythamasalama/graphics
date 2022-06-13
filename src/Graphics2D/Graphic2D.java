package Graphics2D;

import Helpers.Helpers;
import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Graphic2D extends JPanelProject {
    Graphics2D g2d;
    Graphics g;

    public void example1(Graphics g) {
        g2d = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{100, 200, 200, 100, 100},
                new int[]{100, 100, 150, 150, 100},
                5
        );
        g2d.drawPolygon(p);
        g2d.rotate(90 * Math.PI / 180, 100, 100);
        g2d.drawPolygon(p);
    }

    public void example2(Graphics g) {
        g2d = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{100, 200, 200, 100, 100},
                new int[]{100, 100, 150, 150, 100},
                5
        );
        g2d.drawPolygon(p);
        Helpers.scale(0.5, 0.5, 100, 100, g2d);
        g2d.drawPolygon(p);
    }

    public void example3(Graphics g) {
        g2d = (Graphics2D) g;
        Polygon p = new Polygon(
                new int[]{100, 200, 200, 100, 100},
                new int[]{100, 100, 150, 150, 100},
                5
        );
        g2d.drawPolygon(p);
        AffineTransform t = new AffineTransform();
        t.rotate(40 * Math.PI / 180);
        g2d.setTransform(t);
        g2d.drawPolygon(p);
    }

    public void example4(Graphics g) {
        g2d = (Graphics2D) g;
        // to change coordinates x and y
        g2d.translate(100, 100);
        // 1
        g2d.setColor(Color.green);
        g2d.drawLine(0, 0, 100, 0);
        // 2
        g2d.setColor(Color.yellow);
        g2d.translate(100, 0);
        g2d.rotate(-60 * Math.PI / 180);
        g2d.drawLine(0, 0, 50, 0);
        // 3
        g2d.setColor(Color.red);
        g2d.translate(50, 0);
        g2d.rotate(-120 * Math.PI / 180);
        g2d.drawLine(0, 0, 100, 0);
        // 4
        g2d.setColor(Color.blue);
        g2d.translate(100, 0);
        g2d.rotate(-60 * Math.PI / 180);
        g2d.drawLine(0, 0, 50, 0);
    }

    public void example4WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 100, g2d);
        // 1
        g2d.setColor(Color.green);
        Helpers.forward(100, g2d);
        Helpers.left(60, g2d);
        // 2
        g2d.setColor(Color.yellow);
        Helpers.forward(50, g2d);
        Helpers.left(120, g2d);
        // 3
        g2d.setColor(Color.red);
        Helpers.forward(100, g2d);
        Helpers.left(60, g2d);
        // 4
        g2d.setColor(Color.blue);
        Helpers.forward(50, g2d);
        Helpers.left(120, g2d);
    }

    public void example5(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.translate(100, 100);
        for (int i=0 ; i<3 ;i++){
            g2d.drawLine(0, 0, 80, 0);
            g2d.translate(80, 0);
            g2d.rotate(-120 * Math.PI / 180);
        }
    }

    public void example5WithHelper(Graphics g) {
        g2d = (Graphics2D) g;
        Helpers.moveTo(100, 100, g2d);
        for (int i=0 ; i<3 ;i++){
            Helpers.forward(80,g2d);
            Helpers.left(120, g2d);
        }
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Graphic2D");
        new JFrameProject(new Graphic2D(), "Polygon");
    }
}
