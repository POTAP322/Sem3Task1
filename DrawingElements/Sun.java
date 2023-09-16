package Sem3Task1.DrawingElements;

import Sem3Task1.DrawingUtils;

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

    public void draw(Graphics2D g){
        DrawingUtils.drawSun(g,x,y,r1,r2,n,color);
    }
}
