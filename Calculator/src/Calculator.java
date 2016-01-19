import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	JTextField txt = new JTextField();

	JButton btn0 = new JButton("0");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton multiplay = new JButton("*");
	JButton divide = new JButton("/");
	JButton clear = new JButton("C");
	JButton equal = new JButton("=");
	JButton backspace = new JButton("BackSpace");

	public Calculator() {
		JPanel grid = new JPanel();
		setLayout(new BorderLayout());
		add(txt, BorderLayout.NORTH);
		txt.setPreferredSize(new Dimension(200, 50));
		grid.setLayout(new GridLayout(6, 3));
		plus.addActionListener(this);
		minus.addActionListener(this);
		divide.addActionListener(this);
		clear.addActionListener(this);
		equal.addActionListener(this);
		multiplay.addActionListener(this);
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		backspace.addActionListener(this);

		grid.add(plus);
		grid.add(minus);
		grid.add(divide);
		grid.add(clear);
		grid.add(equal);
		grid.add(multiplay);
		grid.add(btn0);
		grid.add(btn1);
		grid.add(btn2);
		grid.add(btn3);
		grid.add(btn4);
		grid.add(btn5);
		grid.add(btn6);
		grid.add(btn7);
		grid.add(btn8);
		grid.add(btn9);
		grid.add(backspace);
		add(grid);

	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setSize(300, 300);
		calculator.setVisible(true);
		calculator.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn0) {
			txt.setText(txt.getText() + "0");
		} else if (e.getSource() == btn1) {
			txt.setText(txt.getText() + "1");
		} else if (e.getSource() == btn2) {
			txt.setText(txt.getText() + "2");
		} else if (e.getSource() == btn3){
			txt.setText(txt.getText() + "3");
		} else if (e.getSource() == btn4) {
			txt.setText(txt.getText() + "4");
		} else if (e.getSource() == btn5) {
			txt.setText(txt.getText() + "5");
		} else if (e.getSource() == btn6) {
			txt.setText(txt.getText() + "6");
		} else if (e.getSource() == btn7) {
			txt.setText(txt.getText() + "7");
		} else if (e.getSource() == btn8) {
			txt.setText(txt.getText() + "8");
		} else if (e.getSource() == btn9) {
			txt.setText(txt.getText() + "9");
		} else if (e.getSource() == plus) {
			txt.setText(txt.getText() + "+");
		} else if (e.getSource() == minus) {
			txt.setText(txt.getText() + "-");
		} else if (e.getSource() == divide) {
			txt.setText(txt.getText() + "/");
		} else if (e.getSource() == multiplay) {
			txt.setText(txt.getText() + "*");
		}else if (e.getSource() == clear) {
			txt.setText(null);
		}else if (e.getSource() == backspace) {
			String str = txt.getText();
			str = str.substring(0,str.length()-1);
			txt.setText(str);
			
		}else if (e.getSource() == equal) {
			int result=0;
			String eqtr = txt.getText();
			String arr[];
			arr = eqtr.split("\\+");
			
			for (int i = 0; i < arr.length; i++) {
				result = result + Integer.parseInt(arr[i]);
			}
			String Answer = result+ "";
			txt.setText(Answer);
		}

	}
}
