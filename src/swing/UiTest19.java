package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UiTest19 extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label;
	private JButton button;

	public UiTest19() {
		setTitle("스윙에 그림배치 연습");
		setSize(600,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		label = new JLabel("이미지를 보려면 아래 버튼을 클릭하세요");
		button = new JButton("이미지 레이블");
		ImageIcon icon=new ImageIcon("./image/icon.jpg");
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		
		add(panel);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ImageIcon dogIcon= new ImageIcon("./image/dog.jpg");
		label.setIcon(dogIcon);
		label.setText(null);
	}

	public static void main(String[] args) {
		new UiTest19();
	}

}
