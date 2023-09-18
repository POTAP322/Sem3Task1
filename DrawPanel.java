package Sem3Task1;

import Sem3Task1.DrawingElements.BackGround;
import Sem3Task1.DrawingElements.Sun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class DrawPanel extends JPanel {
    Sun sun1;

    public DrawPanel() {
        sun1 = new Sun(200, 200, 150, 50, 10, Color.orange);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sun1.setX(sun1.getX()+10);
                repaint();
            }
        });
    }


    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        BackGround.draw(g);


    }

}
