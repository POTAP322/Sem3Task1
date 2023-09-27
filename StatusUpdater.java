package Sem3Task1;

import Sem3Task1.DrawingElements.TankCanon;

import javax.swing.*;
import java.awt.*;

public class StatusUpdater {
    private DrawPanel jp;

    public StatusUpdater(DrawPanel jp) {
        this.jp = jp;
    }
    public void update(){
        TankCanon tc = jp.tank.getTankCanon();

        if(tc.getStatus() == TankCanon.statusEnum.GOING_BACK){
            tc.moveDx(-tc.dx);
            if(tc.getX() <= tc.LEFT_X) tc.setStatus(TankCanon.statusEnum.GOING_FORWARD);
        }
        else if(tc.getStatus() == TankCanon.statusEnum.GOING_FORWARD){
            tc.moveDx(tc.dx);
            if(tc.getX() >= tc.RIGHT_X) tc.setStatus(TankCanon.statusEnum.STOP);
        }
    }
}
