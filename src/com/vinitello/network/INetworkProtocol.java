package com.vinitello.network;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkProtocol;

@ImplementedBy(BaseNetworkProtocol.class)
public interface INetworkProtocol {

	public INetworkProtocolEncoder getEncoder();
	public INetworkProtocolDecoder getDecoder();

}