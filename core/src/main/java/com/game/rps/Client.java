package com.game.rps;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.Socket;
import com.badlogic.gdx.net.SocketHints;

public class Client {
	public static void connectToServer(String serverIP) {
		SocketHints socketHints = new SocketHints();
		Socket socket = Gdx.net.newClientSocket(Net.Protocol.TCP, "host", 8080, socketHints);

		// Send player moves and receive opponent moves
	}

	public static void main(String[] args) {
		connectToServer("SERVER_IP");  // Replace with actual server IP
	}
}
