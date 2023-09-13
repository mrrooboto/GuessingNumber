package com.benjamin;

import java.awt.Dimension;

public class Game {
	public static void main(String[] args) {
		GuessingGameGUI Game = new GuessingGameGUI();
		Game.newGame();
		Game.setSize(new Dimension(450, 300));
		Game.setVisible(true);
	}
}
