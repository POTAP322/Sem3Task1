package Sem3Task1.DrawingElements;

import java.awt.*;

public class TankCanon {
    private final int x;
    private final int y;

    public TankCanon(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public void draw(Graphics2D gr){
        int x = getX();
        int y = getY();
        gr.setColor(Color.decode("#708090"));
        gr.fillRect(325+x,408+y,121,9);

        gr.setStroke(new BasicStroke(3));
        gr.setColor(Color.decode("#6B6B6B"));
        gr.drawLine(324,408,324,416);


    }
}
