package com.game.rps;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class GameScreen extends ScreenAdapter {
	private final RockPaperScissorsGame game;
	private Skin skin;
	private Label resultLabel;
	private int playerWins = 0;
	private int opponentWins = 0;

	public GameScreen(RockPaperScissorsGame game) {
		this.game = game;
		// Initialize UI components
	}

	@Override
	public void render(float delta) {
		// Render UI and handle player inputs for move selection
	}
}
