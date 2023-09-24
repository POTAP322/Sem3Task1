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
        if(status == statusEnum.GOING_BACK){
            x -= dx;
            if(x <= leftX) status = statusEnum.GOING_FORWARD;
        } else if(status == statusEnum.GOING_FORWARD){
            x += dx;
            if(x >= rightX) status = statusEnum.STOP;
        }

        gr.setColor(Color.decode("#708090"));
        gr.fillRect(325+x,408+y,121,9);

        gr.setStroke(new BasicStroke(3));
        gr.setColor(Color.decode("#6B6B6B"));
        gr.drawLine(324,408,324,416);

    }

    public void startAnimation(){
        if(status == statusEnum.STOP) {
            status = statusEnum.GOING_BACK;
            System.out.println("начал анимацию");
        }
    }


}
