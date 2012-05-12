package com.winterlove.encryption;

import com.google.inject.AbstractModule;
import com.vinitello.encryption.IEncryptionAlgorithm;

public class EncryptionModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IEncryptionAlgorithm.class).to(EncryptionAlgorithm.class);
	}

}