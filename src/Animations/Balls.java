package Animations;

import Helpers.Helpers;
import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balls extends JPanelProject implements ActionListener {

    Timer timer;
    int numberOFBalls = 20;

    public Balls() {
        timer = new Timer(300, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int x = 0; x < numberOFBalls; x++) {
            // random color
            g.setColor(new Helpers().randomColor());
            // random coordinate x and y
            g.fillOval((int) (Math.random() * 400), (int) (Math.random() * 350) + 35, 30, 30);
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        repaint();
    }

    public static void main(String[] args) {
        new JFrameProject(new Balls(), "Balls Animations");
    }
}
