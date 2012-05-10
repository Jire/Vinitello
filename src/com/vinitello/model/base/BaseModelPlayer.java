package com.vinitello.model.base;

import com.vinitello.model.ModelPlayer;
import com.vinitello.network.NetworkClient;
import com.vinitello.world.Position;

public abstract class BaseModelPlayer extends BaseModelEntity implements ModelPlayer {

	private final NetworkClient client;

	protected BaseModelPlayer(Position position, NetworkClient client) {
		super(position);
		this.client = client;
	}

	public NetworkClient getClient() {
		return client;
	}

}