package Fractals;

import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;

public class Fractals extends JPanelProject {

    public void example1(int xc, int yc, int r, int n , Graphics g) {
        if (n > 0) {
            g.drawOval(xc-r,yc-r,2*r,2*r);
            example1(xc, yc - 3 * r / 2, r / 2, n - 1,g);
            example1(xc, yc + 3 * r / 2, r / 2, n - 1,g);
            example1(xc + 3 * r / 2, yc, r / 2, n - 1,g);
            example1(xc - 3 * r / 2, yc, r / 2, n - 1,g);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        example1(250, 250, 80, 10, g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Fractals");
        new JFrameProject(new Fractals(), "Fractals");
    }
}
