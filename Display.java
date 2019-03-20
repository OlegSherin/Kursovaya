import javax.swing.JFrame;



public class Display {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Собрать Голландский флаг С_Б_К");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,110); ///*ширина*/,/*высота*/
		frame.setResizable(false); //false чтобы нельзя было бы поменять размеры рамки, true -можно
		frame.add(new Main());
		frame.setVisible(true);
	}

}
