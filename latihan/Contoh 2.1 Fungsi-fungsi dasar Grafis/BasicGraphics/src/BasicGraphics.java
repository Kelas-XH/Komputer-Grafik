import java.applet.Applet;
import java.awt.*;

public class BasicGraphics extends Applet {
    public void paint (Graphics g){
        int xPts[] = {5,25,50,30,15,5};
        int yPts[] = {10,35,20,65,40,10};
        g.drawString("Java Graphics Basic", 0,50);
        g.drawLine(5,100,150,250);
        g.setColor(Color.red);
        g.drawRect(50,100,150,250);
        g.drawRoundRect(50,150,150,250,6,12);
        g.drawPolygon(xPts,yPts,xPts.length);
        g.drawOval(150,100,250,55 );
        g.drawArc(50,100,150,275,95,155);
    }
}
