package Fractals;

import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import java.awt.*;

public class Fractals extends JPanelProject {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public static void main(String[] args) {
        System.out.println("welcome to graphic ---> Fractals");
        new JFrameProject(new Fractals(), "Fractals");
    }
}
