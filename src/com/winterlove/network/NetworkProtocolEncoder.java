package com.winterlove.network;

import com.google.inject.Inject;
import com.vinitello.encryption.IEncryptionAlgorithm;
import com.vinitello.network.base.BaseNetworkProtocolEncoder;

public class NetworkProtocolEncoder extends BaseNetworkProtocolEncoder {

	@Inject
	public NetworkProtocolEncoder(IEncryptionAlgorithm encryptionAlgorithm) {
		super(encryptionAlgorithm);
	}

}