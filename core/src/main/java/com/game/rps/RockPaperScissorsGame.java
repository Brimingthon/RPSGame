package com.game.rps;

import com.badlogic.gdx.Game;

public class RockPaperScissorsGame extends Game {
	@Override
	public void create() {
		setScreen(new GameScreen(this));
	}
}
