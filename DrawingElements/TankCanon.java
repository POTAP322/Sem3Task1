package Sem3Task1.DrawingElements;

import java.awt.*;

public class TankCanon {
    private int x;
    private int y;
    public final int dx = 3;
    public final int leftX = x-20;
    public final int rightX = x;

    private enum statusEnum {STOP, GOING_BACK, GOING_FORWARD};
    private statusEnum status = statusEnum.STOP;


    public TankCanon(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void draw(Graphics2D gr){
        gr.setColor(Color.decode("#708090"));
        gr.fillRect(325+x,408+y,121,9);

        gr.setStroke(new BasicStroke(3));
        gr.setColor(Color.decode("#6B6B6B"));
        gr.drawLine(324,408,324,416);

        if(status == statusEnum.GOING_BACK){

            gr.setColor(new Color(143, 143, 143, 178));
            gr.fillOval(423+x,377+y,85,70);

            gr.setColor(Color.decode("#e25822"));
            gr.fillOval(430+x,392+y,55,40);

            x -= dx;
            if(x <= leftX) status = statusEnum.GOING_FORWARD;
        }
        else if(status == statusEnum.GOING_FORWARD){
            gr.setColor(new Color(143, 143, 143, 90));
            gr.fillOval(427+x,357+y,130,110);
            x += dx;
            if(x >= rightX) status = statusEnum.STOP;
        }
    }

    public void shoot(){
        if(status == statusEnum.STOP) {
            status = statusEnum.GOING_BACK;
            System.out.println("анимация выстрела");
        }
    }


}
