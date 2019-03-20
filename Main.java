import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Main extends JPanel {
	public void paint(Graphics g) {
		//отрисовка всех объектов
		g.drawLine(10, 8, 570, 8); //линии рамки игрового поля
		g.drawLine(10, 63, 570, 63);
		g.drawLine(10, 8, 10, 63);
		g.drawLine(570, 8, 570, 63); //конец отрисовки прямоугольника
		g.drawLine(103, 8, 103, 63);
		g.drawLine(196,8, 196, 63);
		g.drawLine(289, 8, 289, 63);// деления в прямоугольнике
		g.drawLine(382, 8, 382, 63);
		g.drawLine(476, 8, 476, 63);
		//рисуем круги	
			g.setColor(Color.RED);
			g.fillOval(25, 10, 50, 50);
			g.fillOval(120, 10, 50, 50);
			g.setColor(Color.WHITE);
			g.fillOval(215, 10, 50, 50);
			g.fillOval (310,10,50,50);
			g.setColor(Color.BLUE);
			g.fillOval (405,10,50,50);
			g.fillOval (500,10,50,50);// нарисовали круги
			
			
		
		
		}

}
