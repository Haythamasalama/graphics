package Helpers;

import java.awt.*;

public class Helpers {

    /**
     * generate a random color
     * @return Color
     */
    public Color randomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        return new Color(r, g, b);
    }
}
