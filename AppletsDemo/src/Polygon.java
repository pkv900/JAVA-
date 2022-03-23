import java.applet.Applet;
import java.awt.Graphics;

public class Polygon extends Applet{
	
	int a1[]={20, 120, 220, 20};
	int b1[]={20, 120, 20, 20};
	int n1=4;
//	int a2[]= {120, 220, 220, 120};
//	int b2[]= {120, 20, 220, 120};
//	int n2=4;
	
	public void init() {
		
	}
		
		public void paint(Graphics g)
		{
		
			 g.drawPolygon(a1,b1,n1);
			 //g.fillPolygon(a2,b2,n2);

			
		}
	}