package com.winterlove.network;

import com.google.inject.Inject;
import com.vinitello.network.INetworkProtocol;
import com.vinitello.network.base.BaseNetworkService;

public class NetworkService extends BaseNetworkService {

	@Inject
	protected NetworkService(INetworkProtocol protocol) {
		super(2000, protocol);
	}

}