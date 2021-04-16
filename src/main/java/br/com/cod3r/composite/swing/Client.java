package br.com.cod3r.composite.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		JLabel title = new JLabel("TITULO");
		frame.add(title, BorderLayout.NORTH);

		JPanel panel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Nome");
		JTextField field = new JTextField();
		field.setText("teste teste texto");
		JButton button = new JButton("OK");
		panel.add(label);
		panel.add(field);
		panel.add(button);

		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}
}
