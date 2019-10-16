import java.util.*;
import java.awt.*;
import java.applet.*;

public class applets extends Applet {
	public void paint(Graphics g) {
		g.drawOval(0, 0, 200, 200);
		//eyes balls
		g.drawOval(40, 50, 20, 40);
		g.drawOval(140, 50, 20, 40);
		//eye black balls
		g.fillOval(44, 70, 12, 20);
		g.fillOval(144, 70, 12, 20);
		//nose
		g.drawOval(90, 90, 20, 20);
		//mouth
		g.drawOval(80, 130, 40, 40);
	}
}