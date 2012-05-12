package com.vinitello.network;

import java.util.List;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkService;

@ImplementedBy(BaseNetworkService.class)
public interface INetworkService {

	public List<INetworkClient> getClients();
	public INetworkProtocol getProtocol();

}