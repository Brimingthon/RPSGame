package com.game.rps;

public enum Move {
	ROCK, PAPER, SCISSORS;

	public static Move getWinner(Move move1, Move move2) {
		if (move1 == move2) return null;  // Tie
		return switch (move1) {
			case ROCK -> (move2 == SCISSORS) ? move1 : move2;
			case PAPER -> (move2 == ROCK) ? move1 : move2;
			case SCISSORS -> (move2 == PAPER) ? move1 : move2;
		};
	}
}
