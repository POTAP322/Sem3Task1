package Sem3Task1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        //g.rotate(Math.toRadians(90),400,300);
        g.setPaint(new LinearGradientPaint(400,0,400,600,
                new float[]{0.2f,0.7f},
                new Color[]{Color.decode("#7FB4DC"),Color.decode("#D3F2FF")}));
        g.fillRect(0,0,800,600);
        //g.rotate(-Math.toRadians(90),400,300);
//        g.setColor(Color.GREEN);
//        g.drawLine(10, 10, 150, 150);
//        final int Size = 2000;
//        int[] x = new int[Size];
//        int[] y  = new int[Size];
//        for(int i = 0; i<Size;i++){
//            x[i]=i*5;
//            y[i] = 100+(int)(50*Math.cos(i*0.1));
//        }
//
//        g.setStroke(new BasicStroke(5));
//        g.drawPolygon(x,y,Size);
//        g.setColor(Color.RED);
//        g.fillPolygon(x,y,Size);

    }
}
