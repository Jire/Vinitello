package com.vinitello.network.base;

import java.util.ArrayList;
import java.util.List;

import com.vinitello.network.INetworkClient;
import com.vinitello.network.INetworkProtocol;
import com.vinitello.network.INetworkService;

public abstract class BaseNetworkService implements INetworkService {

	private final List<INetworkClient> clients;
	private final INetworkProtocol protocol;

	protected BaseNetworkService(int initialClientCapacity, INetworkProtocol protocol) {
		this.clients = new ArrayList<INetworkClient>(initialClientCapacity);
		this.protocol = protocol;
	}

	@Override
	public List<INetworkClient> getClients() {
		return clients;
	}

	@Override
	public INetworkProtocol getProtocol() {
		return protocol;
	}

}