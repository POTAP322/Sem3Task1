package Sem3Task1;

import Sem3Task1.DrawingElements.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DrawPanel extends JPanel {
    Sun sun1;
    Tank tank;
    TankCanon tankCanon;
    AntiTankHedgehog antiTankHedgehog;
    AntiTankHedgehog antiTankHedgehog2;

    Timer timer;

    public DrawPanel() {
        tankCanon = new TankCanon(0, 0);
        timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                repaint();
            }
        });
        timer.start();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tankCanon.startAnimation();
            }
        });
        //timer.start();
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


}
