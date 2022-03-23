
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.*;

public class LoginScreen {

	public LoginScreen()
	{
		TextField name,pass;
		
		Frame fr = new Frame();
		
		
		Label lb = new Label("USer ID");
		
		fr.add(lb);
		
		 Label n = new Label("Name:",Label.CENTER);
		 
	     Label p = new Label("password:",Label.CENTER);

	     name=new TextField(20);
	     
	     pass=new TextField(20);
	     
	     this.add(n);
	     
	     this.add(name);
	     
	     this.add(p);
	     
	     this.add(pass);
	     
		TextField tf = new TextField();
		
		fr.add(tf);
		
		fr.setSize(500,300);
		
		fr.setLayout(new FlowLayout());
		
		fr.setVisible(true);
		
	}
	private void add(Label p) {
		// TODO Auto-generated method stub
		
	}
	private void add(TextField pass) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		
		LoginScreen l1 = new LoginScreen();
		
		 //l1.setTitle("Login Screen");
		
	}

}
