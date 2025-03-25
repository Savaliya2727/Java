import java.awt.*;

import java.awt.event.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class Layout3 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("Layout Demo");
		f.setSize(500,500);

		f.setLayout(new BorderLayout(3,3));
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		
		
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.WEST);
		f.add(b3,BorderLayout.NORTH);
		f.add(b4,BorderLayout.SOUTH);
		f.add(b5,BorderLayout.CENTER);
		
		
		f.addWindowListener(new WindowAdapter()
				{
					public static void WindowClosing(WindowEvent e)
					{
						f.dispose();
					}
				});
		
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
	}
}
