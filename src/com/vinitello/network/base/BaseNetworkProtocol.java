package com.vinitello.network.base;

import com.vinitello.network.NetworkProtocol;
import com.vinitello.network.NetworkProtocolDecoder;
import com.vinitello.network.NetworkProtocolEncoder;

public abstract class BaseNetworkProtocol implements NetworkProtocol {

	private final NetworkProtocolEncoder encoder;
	private final NetworkProtocolDecoder decoder;

	protected BaseNetworkProtocol(NetworkProtocolEncoder encoder, NetworkProtocolDecoder decoder) {
		this.encoder = encoder;
		this.decoder = decoder;
	}

	@Override
	public NetworkProtocolEncoder getEncoder() {
		return encoder;
	}

	@Override
	public NetworkProtocolDecoder getDecoder() {
		return decoder;
	}

}