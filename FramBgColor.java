import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramBgColor {

	public static void main(String[] args) {
	
		Frame f = new Frame();
		f.setSize(500, 500);
		f.setVisible(true);
	//	f.setBackground(Color.BLUE);
	
		f.setLayout(null);
		
		Button b1 = new Button("Green");
		Button b2 = new Button("Red");
		
		b1.setBounds(100, 100, 100, 20);
		b2.setBounds(100, 200, 100, 20);
		
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						f.setBackground(Color.GREEN);
					}
			
				});
		
		b2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.RED);
			}
	
		});
		
	}

}
