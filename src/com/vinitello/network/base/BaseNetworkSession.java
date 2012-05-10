package com.vinitello.network.base;

import java.net.Socket;

import com.vinitello.network.NetworkSession;

public abstract class BaseNetworkSession implements NetworkSession {

	private final Socket socket;

	protected BaseNetworkSession(Socket socket) {
		this.socket = socket;
	}

	@Override
	public Socket getSocket() {
		return socket;
	}

}