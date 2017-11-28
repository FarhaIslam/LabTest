package farha.ru.java;
import java.awt.*;
import java.applet.*;

public class SmileyFace extends Applet {
	
	public void paint(Graphics g){
			
			g.setColor(Color.yellow);
			g.fillOval(100,100,100,100);
			g.setColor(Color.blue);
			g.fillOval(120,125,20,30);
			g.fillOval(160,125,20,30);
			g.setColor(Color.red);
			//g.fillArc(130, 165, 40, 20, 0, -180);
			g.drawArc(130,165,40,20,0,-180);

		
	    }
}
