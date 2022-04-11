package Polygon;

import SetupProject.JFrameProject;
import SetupProject.JPanelProject;
import java.awt.*;

public class Polygons extends JPanelProject {


    public void rectangle(Graphics g) {
        // points : (100,100) , (200,100) ,(200,150) ,(100,150)
        g.drawPolygon(
                new int[]{100, 200, 200, 100},
                new int[]{100, 100, 150, 150},
                4
        );

        /*
         * or you can use different way to draw polygon
         * 1- make new object polygon
         * 2- use add point method
         * 3- use draw polygon  method
         */
        Polygon rec = new Polygon();
        rec.addPoint(200,200);
        rec.addPoint(300,200);
        rec.addPoint(300,250);
        rec.addPoint(200,250);
        g.drawPolygon(rec);
    }

    public void triangle(Graphics g) {
        g.drawPolygon(
                new int[]{100, 200, 150},
                new int[]{100, 100, 200},
                3
        );
    }
    @Override
    public void paint(Graphics g) {
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Polygon");
        new JFrameProject(new Polygons(), "Polygon");
    }

}
