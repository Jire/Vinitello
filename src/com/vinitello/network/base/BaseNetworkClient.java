package com.vinitello.network.base;

import java.util.UUID;

import com.vinitello.network.NetworkClient;
import com.vinitello.network.NetworkSession;

public abstract class BaseNetworkClient implements NetworkClient {

	private final UUID uuid;
	private final NetworkSession session;

	protected BaseNetworkClient(UUID uuid, NetworkSession session) {
		this.uuid = uuid;
		this.session = session;
	}

	protected BaseNetworkClient(NetworkSession session) {
		this(UUID.randomUUID(), session);
	}

	@Override
	public UUID getUUID() {
		return uuid;
	}

	@Override
	public NetworkSession getSession() {
		return session;
	}

}