package com.winterlove.network;

import com.google.inject.Inject;
import com.vinitello.network.base.BaseNetworkClient;

public class NetworkClient extends BaseNetworkClient {

	@Inject
	protected NetworkClient(NetworkSession session) {
		super(session);
	}

}