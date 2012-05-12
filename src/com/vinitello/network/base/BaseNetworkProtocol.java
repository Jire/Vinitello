package com.vinitello.network.base;

import com.vinitello.network.INetworkProtocol;
import com.vinitello.network.INetworkProtocolDecoder;
import com.vinitello.network.INetworkProtocolEncoder;

public abstract class BaseNetworkProtocol implements INetworkProtocol {

	private final INetworkProtocolEncoder encoder;
	private final INetworkProtocolDecoder decoder;

	protected BaseNetworkProtocol(INetworkProtocolEncoder encoder, INetworkProtocolDecoder decoder) {
		this.encoder = encoder;
		this.decoder = decoder;
	}

	@Override
	public INetworkProtocolEncoder getEncoder() {
		return encoder;
	}

	@Override
	public INetworkProtocolDecoder getDecoder() {
		return decoder;
	}

}