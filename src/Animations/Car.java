package Animations;

import SetupProject.JFrameProject;
import SetupProject.JPanelProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Car extends JPanelProject implements ActionListener {

    Timer timer;
    int x = 10, y = 50, width = 180;

    public Car() {
        timer = new Timer(100, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(x + 10, y, x + 20, y - 20);
        g.drawLine(x + 20, y - 20, x + (width - 30), y - 20);
        g.drawLine(x + (width - 30), y - 20, x + (width - 20), y);
        g.drawRect(x, y, width, 15);
        g.drawOval(x + 20, y + 15,(int) (width*0.1), (int) (width*0.1));
        g.drawOval(x + (int) (width/1.5), y + 15, (int) (width*0.1), (int) (width*0.1));
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        x += 5;
        if (x > getWidth())
            x = -20;
        repaint();
    }

    public static void main(String[] args) {
        new JFrameProject(new Car(), "Car Animations");
    }
}