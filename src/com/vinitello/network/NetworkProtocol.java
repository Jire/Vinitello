package com.vinitello.network;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkProtocol;

@ImplementedBy(BaseNetworkProtocol.class)
public interface NetworkProtocol {

	public NetworkProtocolEncoder getEncoder();
	public NetworkProtocolDecoder getDecoder();

}