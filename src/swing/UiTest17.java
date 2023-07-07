package swing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.*;

class MyPanel17 extends JPanel{
	BufferedImage img=null;
	int img_x=100, img_y=100;
	
	public MyPanel17() {
		try {
			img = ImageIO.read(new File("./image/car.jpg"));
		}catch (IOException ie) {
			System.out.println("자동차 이미지 없다.");
			System.exit(1);
		}
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				switch(keyCode) {
				case KeyEvent.VK_UP: img_y -= 10; break;
				case KeyEvent.VK_DOWN: img_y += 10; break;
				case KeyEvent.VK_LEFT: img_x -= 10; break;
				case KeyEvent.VK_RIGHT: img_x += 10; break;
				}
				repaint();
			}
		});
		this.requestFocus();
		setFocusable(true);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,img_x,img_y,null);
	}
}

public class UiTest17 extends JFrame{
	public UiTest17() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel17());
		setVisible(true);
	}
	public static void main(String[] args) {
		new UiTest17();
	}
}
