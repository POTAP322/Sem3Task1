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
    BackGround backGround = new BackGround();
    Tank tank = new Tank(0, 0);
    AntiTankHedgehog antiTankHedgehog = new AntiTankHedgehog(50, 465);
    AntiTankHedgehog antiTankHedgehog2 = new AntiTankHedgehog(515, 423);

    Timer drawTimer;
    Timer updateTimer;
    StatusUpdater statusUpdater;


    public DrawPanel() {
        statusUpdater = new StatusUpdater(this);
        updateTimer = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusUpdater.update();
            }
        });
        updateTimer.start();
        drawTimer = new Timer(5, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                repaint();
            }
        });
        drawTimer.start();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tank.getTankCanon().shoot();
            }
        });
        //timer.start();
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        backGround.draw((Graphics2D) gr);

        tank.draw((Graphics2D) gr);

        tank.getTankCanon().draw((Graphics2D) gr);

        antiTankHedgehog.draw((Graphics2D) gr);

        antiTankHedgehog2.draw((Graphics2D) gr);
    }


}
