import javax.swing.JFrame;



public class Display {
	public static void main(String[] args) {
		JFrame frame = new JFrame("������� ����������� ���� �_�_�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,110); ///*������*/,/*������*/
		frame.setResizable(false); //false ����� ������ ���� �� �������� ������� �����, true -�����
		frame.add(new Main());
		frame.setVisible(true);
	}

}
