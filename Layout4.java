import java.awt.*;

import java.awt.event.*;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class Layout4 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("Layout Demo");
		f.setSize(500,500);

		f.setLayout(new FlowLayout());
		
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox ch1 = new Checkbox("Option 1",group,false);
		Checkbox ch2 = new Checkbox("Option 2",group,false);
		Checkbox ch3 = new Checkbox("Option 3",group,false);
		
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		
		
		
		
		
		
		ItemListener listener = new ItemListener()
				{

					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						
						Checkbox selected = group.getSelectedCheckbox();
						if(selected != null)
						{
							System.out.println(selected.getLabel());
						}
					}
			
				};
		
		ch1.addItemListener(listener);
		ch2.addItemListener(listener);	
		ch3.addItemListener(listener);
		
		
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
