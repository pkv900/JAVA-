import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class AWTEx extends Frame {

	 public AWTEx() {
		 Button b = new Button("Click");
		 
		 //Set button positon on screen
		 b.setBounds(50,50,100,50);
		 
		 //Lets add button into the frame
		 add(b);
		 
		 //Setting frame width and height
		 setSize(500,300);
		 
		 //Setting the title of the frame
		 setTitle("This is my first AWT example");
		 
		 //Setting layout of the frame
		 setLayout(new FlowLayout());
		 
		 /*By default frame is not vvisible so we 
		  * are setting the visibility to true to
		  * make it visible.
		  */
		 setVisible(true);
	 }
	public static void main(String[] args) {
		
		//Creating the instance  of frame
		AWTEx awt = new AWTEx();

	}

}
