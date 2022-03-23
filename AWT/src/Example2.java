import java.awt.*;
public class Example2 {

	public Example2()
	{
		Frame fr = new Frame();
		
		
		Label lb = new Label("USer ID");
		
		fr.add(lb);
		
		TextField tf = new TextField();
		
		fr.add(tf);
		
		fr.setSize(500,300);
		
		fr.setLayout(new FlowLayout());
		
		fr.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example2 e = new Example2();
		
	}

}
