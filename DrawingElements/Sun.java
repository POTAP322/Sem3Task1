package Sem3Task1.DrawingElements;

import java.awt.*;

public class Sun {
    private int x,y,r1,r2,n;
    Color color;

    public Sun(int x, int y, int r1, int rayLength, int n, Color color) {
        this.x = x;
        this.y = y;
        this.r1 = r1;
        this.r2 = r1+rayLength;
        this.n = n;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics2D g){
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
