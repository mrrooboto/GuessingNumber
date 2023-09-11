package com.benjamin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GuessingGame extends JFrame {
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GuessingNumbers");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guessing numbers game");
		lblNewLabel.setFont(new Font("Norasi", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 12, 416, 21);
		getContentPane().add(lblNewLabel);
	}
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
	}
}
