package Sem3Task1.DrawingElements;

import java.awt.*;

public class Smoke {
    private int x;
    private int y;

    public Smoke(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw1(Graphics2D gr){
        gr.setColor(new Color(143, 143, 143, 178));
        gr.fillOval(423+x,377+y,85,70);

        gr.setColor(Color.decode("#e25822"));
        gr.fillOval(430+x,392+y,55,40);

    }
    public void draw2(Graphics2D gr){
        gr.setColor(new Color(143, 143, 143, 90));
        gr.fillOval(427+x,357+y,130,110);

    }
}
