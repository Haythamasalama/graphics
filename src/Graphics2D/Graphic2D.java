package Graphics2D;

import Helpers.Helpers;
import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class Graphic2D extends JPanelProject {
    Graphics2D g2d;
    Graphics g;
    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Graphic2D");
        new JFrameProject(new Graphic2D(), "Polygon");
    }
}
