package com.winterlove.network;

import java.net.Socket;

import com.google.inject.Inject;
import com.vinitello.network.base.BaseNetworkSession;

public class NetworkSession extends BaseNetworkSession {

	@Inject
	public NetworkSession(Socket socket) {
		super(socket);
	}

}