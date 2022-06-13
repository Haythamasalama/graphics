package Helpers;

import java.awt.*;

public class Helpers {

    /**
     * generate a random color
     *
     * @return Color
     */
    public Color randomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        return new Color(r, g, b);
    }

    /**
     * scale
     *
     * @param sx
     * @param sy
     * @param x
     * @param y
     * @param g2d 
     * [sx   0  xf(1-sx) ]
     * [0   sy  yf(1-sy) ]
     * [0   0      1     ]
     */
    public static void scale(double sx, double sy, double x, double y, Graphics2D g2d) {
        g2d.translate(x, y);
        g2d.scale(sx, sy);
        g2d.translate(-x, -y);
    }
    
    /**
     *  draw line thant translate
     * @param length
     * @param g2d
     */
    public static void forward(int length, Graphics2D g2d) {
        g2d.drawLine(0, 0, length, 0);
        g2d.translate(length, 0);
    }

    /**
     * translate
     * @param x
     * @param y
     * @param g2d
     */
    public static void moveTo(int x, int y, Graphics2D g2d) {
        g2d.translate(x, y);
    }

    /**
     * rotate with (-theta)
     * @param theta
     * @param g2d
     */
    public static void right(double theta, Graphics2D g2d) {
        g2d.rotate(theta * Math.PI / 180);
    }

    /**
     * rotate with (-theta)
     * @param theta
     * @param g2d
     */
    public static void left(double theta, Graphics2D g2d) {
        g2d.rotate(-theta * Math.PI / 180);
    }
}
