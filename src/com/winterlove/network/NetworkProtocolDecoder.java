package com.winterlove.network;

import com.google.inject.Inject;
import com.vinitello.encryption.IEncryptionAlgorithm;
import com.vinitello.network.base.BaseNetworkProtocolDecoder;

public class NetworkProtocolDecoder extends BaseNetworkProtocolDecoder {

	@Inject
	public NetworkProtocolDecoder(IEncryptionAlgorithm encryptionAlgorithm) {
		super(encryptionAlgorithm);
	}

}