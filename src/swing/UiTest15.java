package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame15 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame15() {
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("익명클래스 문법으로 이벤트 처리");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 클릭되지 않았습니다.");
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					label.setText("드디어 버튼이 클릭되었습니다");
				}
			}
		});
		panel.add(button); panel.add(label);
		add(panel);
		setVisible(true);
	}
}

public class UiTest15 {
	public static void main(String[] args) {
		new MyFrame15();
	}
}
