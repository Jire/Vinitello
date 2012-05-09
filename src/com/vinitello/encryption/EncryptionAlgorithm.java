package com.vinitello.encryption;

import com.google.inject.ImplementedBy;
import com.vinitello.encryption.isaac.ISAACEncryptionAlgorithm;

@ImplementedBy(ISAACEncryptionAlgorithm.class)
public interface EncryptionAlgorithm {

	public int nextInt();

}