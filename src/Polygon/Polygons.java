package Polygon;

import SetupProject.JFrameProject;
import SetupProject.JPanelProject;
import java.awt.*;

public class Polygons extends JPanelProject {

    @Override
    public void paint(Graphics g) {
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Polygon");
        new JFrameProject(new Polygons(), "Polygon");
    }

}
