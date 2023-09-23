package Sem3Task1.DrawingElements;

import java.awt.*;

public class AntiTankHedgehog {
    private final int x;
    private final int y;

    public AntiTankHedgehog(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw(Graphics2D gr) {
        int x = getX();
        int y = getY();
        gr.setColor(Color.decode("#372B2F"));
        int[] x1 = {0, 9, 92, 83};
        int[] y1 = {20, 20, 118, 118};
        for (int i = 0; i < x1.length; i++) {
            x1[i] += x;
            y1[i] += y;
        }
        gr.fillPolygon(x1, y1, x1.length);

        int[] x2 = {95, 106, 11, 0};
        int[] y2 = {38, 38, 104, 104};
        for (int i = 0; i < x2.length; i++) {
            x2[i] += x;
            y2[i] += y;
        }
        gr.fillPolygon(x2, y2, x2.length);

        int[] x3 = {77, 86, 36, 25};
        int[] y3 = {8, 8, 122, 122};
        for (int i = 0; i < x3.length; i++) {
            x3[i] += x;
            y3[i] += y;
        }
        gr.fillPolygon(x3, y3, x3.length);
    }

}
