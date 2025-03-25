import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class LoginPage {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(500,500);
		f.setTitle("Login Page");
		
		Label lemail = new Label("Email : ");
		Label lpass = new Label("Password : ");
		TextField tfemail = new TextField();
		TextField tfpass = new TextField();
		tfpass.setEchoChar('*');
		Button b = new Button("Log in");
		
		
		
		lemail.setBounds(100,50,50,20);
		lpass.setBounds(100,50,50,20);
		tfemail.setBounds(200,50,200,20);
		tfpass.setBounds(200,80,200,20);
		b.setBounds(150,150,200,30);
		
		f.add(lemail);
		f.add(tfemail);
		f.add(lpass);
		f.add(tfpass);
		f.add(b);
		
		
		f.addWindowFocusListener((WindowFocusListener) new WindowAdapter () {
			public void WindowClosing(WindowEvent e)
			{
				f.dispose();
				System.exit(0);
			}
		});
		
		b.addActionListener((ActionListener) new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String name = "abc@gmail.com";
				String pass = "1234";
				
				
				if(tfemail.getText().equals(name) && tfpass.getText().equals(pass))
				{
					System.out.print("Login....!");
					f.dispose();
					new Homepage();
				}
				else
				{
					System.out.print("Invalid Login....!");
				}
			}
		});
		
		f.setLocationRelativeTo(null);
		f.setLayout(null);;
		f.setVisible(true);
	}
}


class Homepage extends Frame
{
	public Homepage()
	{
		Frame f = new Frame();
		f.setSize(500,500);
		f.setTitle("Home Page");
		
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}




