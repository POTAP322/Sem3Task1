package Sem3Task1;

import java.awt.*;

public class DrawingUtils {
    public static void drawSun(Graphics2D g, int x, int y, int r1, int r2, int n, Color color) {
        Color oldColor = g.getColor();//восстановление изнач цвета
        g.setColor(color);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = da*i;
            double x1 = x;
            double y1 = y;
            double x2 = x+r2* Math.cos(a);
            double y2 = y+r2* Math.sin(a);
            g.drawLine((int) x1,(int)y1, (int) x2,(int)y2);

        }
        g.drawOval(x - (r1 / 2), y - (r1 / 2), r1, r1);
        g.fillOval(x - (r1 / 2), y - (r1 / 2), r1, r1);

        g.setColor(oldColor);
    }
}
