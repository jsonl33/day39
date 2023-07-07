package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame01 extends JFrame {
	JButton bt01;
	private JButton bt02, bt03;

	public MyFrame01() {
		setTitle("절대 위치 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		JPanel p = new JPanel();
		p.setLayout(null);

		bt01 = new JButton("Button #01");
		p.add(bt01);
		bt02 = new JButton("Button #02");
		p.add(bt02);
		bt03 = new JButton("Button #03");
		p.add(bt03);

		bt01.setBounds(20, 5, 95, 30);
		bt02.setBounds(55, 45, 105, 70);
		bt03.setBounds(180, 15, 105, 90);
		
		add(p);

		setVisible(true);
		setLocationRelativeTo(null);
	}
}

public class UiTest13 {
	public static void main(String[] args) {
		new MyFrame01();
	}
}
