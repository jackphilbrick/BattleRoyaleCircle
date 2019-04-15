import java.awt.*;
import javax.swing.*;
 
public class BattleRoyaleCircle extends JPanel {
 
	public void paintComponent(Graphics g) {
		 
	     // draw oval
	     //g.drawOval(20, 30, 75, 100); 
	 
	     // draw circle 
		int randX = (int)(Math.random() * 700);
		int randY = (int)(Math.random() * 700);
		 
		int storeX = randX;
		int storeY = randY;
		int radiusX = 300;
		int radiusY = 300;
		System.out.println(storeX);
		 System.out.println(storeY); 
		g.drawOval(randX, randY, radiusX, radiusY); 
		 
		 for(int i = 2; i <= 3; i++){
			 randX = (int)(Math.random() * (((storeX + (radiusX/2)) - (storeX - (radiusX/2))) + 1)) + (storeX-(radiusX/2));
			 randY = (int)(Math.random() * (((storeY + (radiusY/2)) - (storeY - (radiusY/2))) + 1)) + (storeY-(radiusY/2));
		 
			 //double x = (Math.random()*((max-min)+1))+min;
			 
			 storeX = randX;
			 storeY = randY;
			 radiusX = radiusX/i;
			 radiusY = radiusY/i;
			 
			 System.out.println(i);

			 g.drawOval(randX, randY, radiusX, radiusY); 
		 }
	  }
 
  public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Battle Royale Safe Zone Algorithm");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
    frame.setSize(1000, 1000);
 
    BattleRoyaleCircle panel = new BattleRoyaleCircle();
 
    frame.add(panel);
 
    frame.setVisible(true);
  }
}