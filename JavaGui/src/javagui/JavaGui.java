package javagui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class JavaGui extends JFrame implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4160713728295546112L;
	int x = 10;
	int y = 30;

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.green);
		g.fillOval(x, y, 40, 40);
	}

	public JavaGui() {
		addKeyListener(this);
	}

	public static void main(String[] args) {

		JavaGui obj = new JavaGui();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(500, 500);
		obj.setVisible(true);
		obj.setResizable(false);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			x--;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			x++;
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			y--;

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			y++;
		}
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
