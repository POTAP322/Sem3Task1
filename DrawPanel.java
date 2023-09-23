package Sem3Task1;

import Sem3Task1.DrawingElements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class DrawPanel extends JPanel {
    Sun sun1;
    Tank tank;
    TankCanon tankCanon;
    AntiTankHedgehog antiTankHedgehog;
    AntiTankHedgehog antiTankHedgehog2;

    public DrawPanel() {
//        sun1 = new Sun(200, 200, 150, 50, 10, Color.green);
//        this.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                sun1.setX(sun1.getX()+10);
//                repaint();
//            }
//        });
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        BackGround.draw(g);
        tank = new Tank(0, 0);
        tank.draw((Graphics2D) gr);
        tankCanon = new TankCanon(0, 0);
        tankCanon.draw((Graphics2D) gr);
        antiTankHedgehog = new AntiTankHedgehog(50, 465);
        antiTankHedgehog.draw((Graphics2D) gr);

        antiTankHedgehog2 = new AntiTankHedgehog(515, 423);
        antiTankHedgehog2.draw((Graphics2D) gr);
    }

}
