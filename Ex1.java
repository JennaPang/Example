package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex1 extends JFrame {

	public static void main(String[] args) {
		Ex1 frame = new Ex1();
	}

	public Ex1() {
		setBounds(100, 100, 266, 239);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Open");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Read");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		panel.add(btnNewButton_2);
		
		Panel panel2 = new Panel();
		getContentPane().add(panel2, BorderLayout.CENTER);
		
		JLabel no1 = new JLabel("Hello");
		panel2.add(no1);
		
		JLabel no2 = new JLabel("Java");
		panel2.add(no2);
		
		JLabel no3 = new JLabel("World");
		panel2.add(no3);
		
		setVisible(true);
		
		}
}
# Example
