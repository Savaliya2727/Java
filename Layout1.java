import java.awt.*;

import java.awt.event.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class Layout1 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("Layout Demo");
		f.setSize(500,500);

		f.setLayout(new FlowLayout());
		
		Button b1 = new Button("First");
		Button b2 = new Button("Second");
		Button b3 = new Button("Third");
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
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
