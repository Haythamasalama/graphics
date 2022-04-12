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

    public void example3(Graphics g) {
        g.setColor(Color.green);
        g.fillPolygon(
                new int[]{100, 200, 150},
                new int[]{100, 100, 150},
                3
        );
        g.setColor(Color.yellow);
        g.fillPolygon(
                new int[]{150, 200, 200},
                new int[]{150, 100, 200},
                3
        );
        g.setColor(Color.black);
        g.fillPolygon(
                new int[]{150, 100, 200},
                new int[]{150, 200, 200},
                3
        );
        g.setColor(Color.gray);
        g.fillPolygon(
                new int[]{150, 100, 100},
                new int[]{150, 200, 100},
                3
        );
    }

    public void psFlag(Graphics g) {
        g.setColor(Color.black);
        g.fillPolygon(
                new int[]{100, 300, 300,100},
                new int[]{100, 100, 150,150},
                4
        );
        g.setColor(Color.green);
        g.fillPolygon(
                new int[]{100, 300, 300,100},
                new int[]{200, 200, 250,250},
                4
        );
        g.setColor(Color.white);
        g.fillPolygon(
                new int[]{100, 300, 300,100},
                new int[]{150, 150, 200,200},
                4
        );
        g.setColor(Color.red);
        g.fillPolygon(
                new int[]{175, 100, 100},
                new int[]{175, 250, 100},
                3
        );
    }

    public void equilateralTriangle(Graphics g,int x , int y ,int l){
        int x1 = (int) (x - 0.5 * l);
        int x2 = (int) (x + 0.5 * l);
        int y1 = (int) (y + (Math.sqrt(3) * l)/2 );

        g.fillPolygon(
                new int[]{x, x1, x2},
                new int[]{y, y1, y1},
                3
        );
    }

    public void hexagonal(Graphics g,int x , int y ,int l){
        int x1 = (int) (x - 0.5 * l);
        int y1 = (int) (y - Math.sqrt(3) * l / 2);
        int x2 = (int) (x + 0.5 * l);
        int x3 = (x - l);
        int x4 = (x + l);
        int y5 = (int) (y + Math.sqrt(3) * l / 2);

        g.fillPolygon(
                new int[]{x1, x2, x4, x2, x1, x3},
                new int[]{y1, y1, y, y5, y5, y},
                6
        );
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // choose the function you want to print
        this.hexagonal(g,200,200,50);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Polygon");
        new JFrameProject(new Polygons(), "Polygon");
    }

}
