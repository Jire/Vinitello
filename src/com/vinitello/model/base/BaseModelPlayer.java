package com.vinitello.model.base;

import com.vinitello.model.ModelPlayer;
import com.vinitello.network.INetworkClient;
import com.vinitello.world.Position;

public abstract class BaseModelPlayer extends BaseModelEntity implements ModelPlayer {

	private final INetworkClient client;

	protected BaseModelPlayer(Position position, INetworkClient client) {
		super(position);
		this.client = client;
	}

	public INetworkClient getClient() {
		return client;
	}

}