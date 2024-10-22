package com.game.rps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.ServerSocket;
import com.badlogic.gdx.net.ServerSocketHints;
import com.badlogic.gdx.net.Socket;
import com.game.rps.RockPaperScissorsGame;

public class Server {
	public static void startServer() {
		ServerSocketHints serverHints = new ServerSocketHints();
		// Use Gdx.net to access the Net instance
		ServerSocket server = Gdx.net.newServerSocket(Net.Protocol.TCP, 8080, serverHints);

		while (true) {
			Socket socket = server.accept(null);
			// Handle game data exchange
		}
	}

	public static void main(String[] args) {
		startServer();
	}
}
