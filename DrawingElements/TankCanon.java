package Sem3Task1.DrawingElements;

import java.awt.*;

public class TankCanon {
    private int x;
    private int y;
    public final int dx = 3;
    public final int LEFT_X = x-20;
    public final int RIGHT_X = x;

    public enum statusEnum {STOP, GOING_BACK, GOING_FORWARD};
    private statusEnum status = statusEnum.STOP;
    private Smoke smoke = new Smoke(0,0);


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

    public int getDx() {
        return dx;
    }

    public int getLeftX() {
        return LEFT_X;
    }

    public int getRIGHT_X() {
        return RIGHT_X;
    }

    public statusEnum getStatus() {
        return status;
    }

    public void setStatus(statusEnum status) {
        this.status = status;
    }

    public void draw(Graphics2D gr){
        gr.setColor(Color.decode("#708090"));
        gr.fillRect(325+x,408+y,121,9);

        gr.setStroke(new BasicStroke(3));
        gr.setColor(Color.decode("#6B6B6B"));
        gr.drawLine(324,408,324,416);

        if(status == statusEnum.GOING_BACK){
            smoke.draw1(gr);
        }
        else if(status == statusEnum.GOING_FORWARD){
            smoke.draw2(gr);
        }

    }

    public void shoot(){
        if(status == statusEnum.STOP) {
            status = statusEnum.GOING_BACK;
            System.out.println("анимация выстрела");
        }
    }
    public void moveDx(int dx){
        x +=dx;
    }

}
