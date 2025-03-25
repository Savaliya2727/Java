import java.awt.*;

public class Loginpage {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(600,500);
		f.setTitle("Login Page");
		f.setLayout(null);
		
		Label l = new Label("Email");
		l.setBounds(100,50,50,20);
		
		Label lp = new Label("Email");
		l.setBounds(100,50,50,20);
		
		TextField tf = new TextField();
		tf.setBounds(100,50,50,20);
		
		TextField tfp = new TextField();
		tfp.setBounds(100,50,50,20);
		
		Button b = new Button();
		b.setLabel("Login Button");
		b.setBounds(100,50,50,20);
		
		f.add(l);
		f.add(b);
		f.add(tf);
		f.add(lp);
		f.add(tfp);
		
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
