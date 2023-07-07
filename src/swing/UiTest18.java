package swing;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel18 extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;

	public MyPanel18() {
		try {
			img = ImageIO.read(new File("./image/car.jpg"));
		} catch (IOException ie) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,img_x,img_y,null);
	}
}

public class UiTest18 extends JFrame{
	public UiTest18() {
		add(new MyPanel18());
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new UiTest18();
	}
}
