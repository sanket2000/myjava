import java.util.*;
import java.awt.*;
import java.applet.*;

public class applets extends Applet {
	public void paint(Graphics g) {
		int a = 4;
		int X = 100;
		int Y = 100;
		//g.drawString ("Hello World", 20, 50);
		g.drawOval((0)*a + X, (0)*a + Y, a*100, a*100);
		//eyes balls
		g.drawOval((20)*a + X, (25)*a + Y, a*10, a*20);
		g.drawOval((70)*a + X, (25)*a + Y, a*10, a*20);
		//eye black balls
		g.fillOval((22)*a + X, (35)*a + Y, a*6, a*10);
		g.fillOval((72)*a + X, (35)*a + Y, a*6, a*10);
		//nose
		int x = 50;
		int y = 50;
		int r = 10;
		g.drawOval((x - r/2)*a + X, (y - r/2)*a + Y, a*r, a*r);
		//mouth
		x = 50;
		y = 75;
		r = 20;
		g.drawOval((x - r/2)*a + X, (y - r/2)*a + Y, a*r, a*r);
	}
}