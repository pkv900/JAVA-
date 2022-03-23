import java.applet.Applet;
import java.awt.Graphics;

public class CircleApplet extends Applet {
	
	int height,width;
	
	public void init() {
		
		height=getSize().height;
		width=getSize().width;
		setName("Circle");
	}
		
		public void paint(Graphics g)
		{
			
			g.drawOval(100,100,100,100);

			
		}
	}