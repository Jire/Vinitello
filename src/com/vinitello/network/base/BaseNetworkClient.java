package com.vinitello.network.base;

import java.util.UUID;

import com.vinitello.network.NetworkClient;

public abstract class BaseNetworkClient implements NetworkClient {

	private final UUID uuid = UUID.randomUUID();

	@Override
	public UUID getUUID() {
		return uuid;
	}

}