import java.applet.Applet;
import java.awt.*;

public class DrawText extends Applet {
    public void paint (Graphics g){
        Font font = new Font("Helvetica", Font.BOLD + Font.ITALIC,22);
        FontMetrics fm = g.getFontMetrics(font);
        String str = new String ("Hasil tinggi edukasi adalah");
        g.setFont(font);
        g.drawString(str,(size().width -   fm.stringWidth(str))/2,
                        ((size().height - fm.getHeight()) / 2) +
                                              fm.getAscent());
    }
}
