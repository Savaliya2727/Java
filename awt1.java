import java.awt.*;

public class awt1 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(800,1000);
		
		Button b = new Button();
		b.setBounds(100,50,500,10);
		
		b.setLabel("Click Here");
		//b.setSize(300,500);
		
		f.add(b);
		
		//b.setSize(20,30);
		
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
}
