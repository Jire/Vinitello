package com.vinitello.network;

import java.util.UUID;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkClient;

@ImplementedBy(BaseNetworkClient.class)
public interface INetworkClient {

	public UUID getUUID();
	public INetworkSession getSession();

}