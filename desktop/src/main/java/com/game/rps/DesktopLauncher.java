package com.game.rps;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("Rock-Paper-Scissors");
		config.setWindowedMode(800, 600);
		new Lwjgl3Application(new RockPaperScissorsGame(), config);
	}
}
