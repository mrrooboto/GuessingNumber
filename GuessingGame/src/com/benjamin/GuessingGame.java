package com.benjamin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame {
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GuessingNumbers");
		getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("Guessing numbers game");
		label_1.setFont(new Font("Norasi", Font.BOLD, 15));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(24, 37, 416, 21);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Guess a number between 1 and 100:");
		label_2.setFont(new Font("FreeMono", Font.BOLD, 11));
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(22, 95, 282, 15);
		getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setBounds(309, 95, 35, 15);
		getContentPane().add(textField);
		textField.setColumns(10);
		btnNewButton.setBounds(147, 147, 147, 33);
		getContentPane().add(btnNewButton);
		
		JLabel label_3 = new JLabel("Enter a number and click guess !");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 217, 428, 15);
		getContentPane().add(label_3);
	}
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private final JButton btnNewButton = new JButton("GUESS!");

	public static void main(String[] args) {
		
	}
}
