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
    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Graphic2D");
        new JFrameProject(new Graphic2D(), "Polygon");
    }
}
