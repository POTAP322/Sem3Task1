package Sem3Task1;

import Sem3Task1.DrawingElements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DrawPanel extends JPanel implements ActionListener {
    Sun sun1;
    Tank tank;
    TankCanon tankCanon;
    AntiTankHedgehog antiTankHedgehog;
    AntiTankHedgehog antiTankHedgehog2;

    Timer timer;

    public DrawPanel() {
        tankCanon = new TankCanon(0, 0);
        timer = new Timer(12,this);
        //timer.start();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                timer.start();

            }
        });
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        BackGround.draw(g);
        tank = new Tank(0, 0);
        tank.draw((Graphics2D) gr);

        tankCanon.draw((Graphics2D) gr);

        antiTankHedgehog = new AntiTankHedgehog(50, 465);
        antiTankHedgehog.draw((Graphics2D) gr);

        antiTankHedgehog2 = new AntiTankHedgehog(515, 423);
        antiTankHedgehog2.draw((Graphics2D) gr);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tankCanon.TempValueX == tankCanon.endValueX){
            while (tankCanon.TempValueX != tankCanon.startValueX){
                tankCanon.setX(tankCanon.getX()+2);
                tankCanon.TempValueX +=2;
                timer.stop();
            }
        }
        tankCanon.setX(tankCanon.getX()-4);
        tankCanon.TempValueX -=4;
        repaint();
    }

}
