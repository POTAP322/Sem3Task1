package Sem3Task1;

import Sem3Task1.DrawingElements.Sun;

import javax.swing.*;
import java.awt.*;



public class DrawPanel extends JPanel {
    Sun sun1;
    public DrawPanel() {
        sun1 = new Sun(200, 200, 150, 50, 10, Color.orange);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
//        //g.rotate(Math.toRadians(90),400,300);
        g.setPaint(new LinearGradientPaint(400, 0, 400, 600,
                new float[]{0.2f, 0.7f},
                new Color[]{Color.decode("#7FB4DC"), Color.decode("#D3F2FF")}));
        g.fillRect(0, 0, 800, 600);

        sun1.draw(g);

    }

}
