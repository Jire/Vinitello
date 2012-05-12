package com.winterlove.network;

import com.google.inject.AbstractModule;
import com.vinitello.network.INetworkClient;
import com.vinitello.network.INetworkProtocol;
import com.vinitello.network.INetworkProtocolDecoder;
import com.vinitello.network.INetworkProtocolEncoder;
import com.vinitello.network.INetworkService;
import com.vinitello.network.INetworkSession;

public class NetworkModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(INetworkService.class).to(NetworkService.class);
		bind(INetworkProtocol.class).to(NetworkProtocol.class);
		bind(INetworkProtocolEncoder.class).to(NetworkProtocolEncoder.class);
		bind(INetworkProtocolDecoder.class).to(NetworkProtocolDecoder.class);
		bind(INetworkSession.class).to(NetworkSession.class);
		bind(INetworkClient.class).to(NetworkClient.class);
	}

}