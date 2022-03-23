import java.applet.Applet;
import java.awt.Graphics;
public class Param extends Applet {

	String str;
	public void init() {
		
		str=getParameter("Pname");
		if(str==null)
		{
			str="Welcome ";
			str="Hello"+str;
		}
	}
	
	public void paint(Graphics g) {
		
		g.drawString(str,200,200);
	}
}
