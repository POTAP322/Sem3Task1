package Sem3Task1;

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
//      g.rotate(Math.toRadians(90),400,300);

        //небо
        g.setPaint(new LinearGradientPaint(400, 0, 400, 600,
                new float[]{0.2f, 0.7f},
                new Color[]{Color.decode("#7FB4DC"), Color.decode("#D3F2FF")}));
        g.fillRect(0, 0, 800, 600);

        //земля
        g.setColor(Color.decode("#544649"));
        int[] x = {0,0,70,70,100,105,147,145,155,155,200,200};
        int[] y = {470,180,180,195,195,220,230,265,265,275,275,300};
        g.fillPolygon(x,y,12);
        g.setColor(Color.decode("#77676C"));
        int[] x1 = {0,500,506,510,610,616,800,800,0};
        int[] y1 = {490,500,510,510,510,520,522,600,600};
        g.fillPolygon(x1,y1,9);






    }

}
