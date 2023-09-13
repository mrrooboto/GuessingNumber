package com.benjamin;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGameGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtGuess;
	private JLabel lblOutput;
	private final JButton guessButton = new JButton("GUESS!");
	private int theNumber;
	
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			if (guess < theNumber) 
				message = guess + " is too low. Try again.";
			else if (guess > theNumber) 
				message = guess + " is too high. Try again.";
			else {
				message = guess + " is correct. Let's play again!";
				newGame();
			}
		} catch (Exception e) {
			message = "Enter a whole number between 1 and 100.";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	
	public GuessingGameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GuessingNumbers");
		getContentPane().setLayout(null);
		
		JLabel topText = new JLabel("Guessing numbers game");
		topText.setFont(new Font("Norasi", Font.BOLD, 15));
		topText.setHorizontalAlignment(SwingConstants.CENTER);
		topText.setBounds(0, 37, 440, 21);
		getContentPane().add(topText);
		
		JLabel guessANumberTxt = new JLabel("Guess a number between 1 and 100:");
		guessANumberTxt.setFont(new Font("FreeMono", Font.BOLD, 11));
		guessANumberTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		guessANumberTxt.setBounds(22, 95, 282, 15);
		getContentPane().add(guessANumberTxt);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setBounds(309, 95, 35, 15);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		guessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		guessButton.setBounds(147, 147, 147, 33);
		getContentPane().add(guessButton);
		
		lblOutput = new JLabel("Enter a number and click guess !");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(0, 217, 440, 15);
		getContentPane().add(lblOutput);
	}
}
