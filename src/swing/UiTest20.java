package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UiTest20 extends JFrame {
	private JButton button;
	private JTextField text, result;

	public UiTest20() {
		setSize(300, 130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ButtonListener2 listener = new ButtonListener2();

		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력: "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);

		panel.add(new JLabel("제곱한 값: "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);

		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);

		add(panel);
		setVisible(true);
	}

	private class ButtonListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button || e.getSource() == text) {
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * value);
				text.requestFocus();
			}
		}
	}

	public static void main(String[] args) {
		new UiTest20();
	}

}
