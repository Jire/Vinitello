package com.vinitello.network.base;

import java.util.ArrayList;
import java.util.List;

import com.vinitello.network.NetworkClient;
import com.vinitello.network.NetworkProtocol;
import com.vinitello.network.NetworkService;

public abstract class BaseNetworkService implements NetworkService {

	private final List<NetworkClient> clients;
	private final NetworkProtocol protocol;

	protected BaseNetworkService(int initialClientCapacity, NetworkProtocol protocol) {
		this.clients = new ArrayList<NetworkClient>(initialClientCapacity);
		this.protocol = protocol;
	}

	@Override
	public List<NetworkClient> getClients() {
		return clients;
	}

	@Override
	public NetworkProtocol getProtocol() {
		return protocol;
	}

}