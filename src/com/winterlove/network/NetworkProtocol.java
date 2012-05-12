package com.winterlove.network;

import com.google.inject.Inject;
import com.vinitello.network.INetworkProtocolDecoder;
import com.vinitello.network.INetworkProtocolEncoder;
import com.vinitello.network.base.BaseNetworkProtocol;

public class NetworkProtocol extends BaseNetworkProtocol {

	@Inject
	protected NetworkProtocol(INetworkProtocolEncoder encoder, INetworkProtocolDecoder decoder) {
		super(encoder, decoder);
	}

}