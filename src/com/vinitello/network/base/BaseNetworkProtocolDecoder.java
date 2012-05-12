package com.vinitello.network.base;

import java.nio.ByteBuffer;

import com.google.inject.Inject;
import com.vinitello.encryption.IEncryptionAlgorithm;
import com.vinitello.network.INetworkProtocolDecoder;
import com.vinitello.network.util.ProtocolConstants;
import com.vinitello.packet.Packet;

public abstract class BaseNetworkProtocolDecoder implements INetworkProtocolDecoder {

	private final IEncryptionAlgorithm encryptionAlgorithm;

	@Inject
	public BaseNetworkProtocolDecoder(IEncryptionAlgorithm encryptionAlgorithm) {
		this.encryptionAlgorithm = encryptionAlgorithm;
	}

	@Override
	public Packet decode(ByteBuffer buffer) {
		if (buffer.limit() <= 0) {
			return null;
		}

		int packetId = buffer.get() - (encryptionAlgorithm.nextInt() & 0xFF);

		int packetLength = getPacketLength(packetId, buffer);
		if(buffer.remaining() < packetLength) {
			return null;
		}

		byte[] packetData = new byte[packetLength];
		buffer.get(packetData);

		return new Packet(packetId, packetLength, packetData);
	}

	private int getPacketLength(int packetId, ByteBuffer buffer) {
		int possibleLength = ProtocolConstants.INCOMING_PACKET_LENGTHS[packetId];
		if (possibleLength == ProtocolConstants.PACKET_SIZE_BYTE) {
			return buffer.get() & 0xFF;
		} else if (possibleLength == ProtocolConstants.PACKET_SIZE_SHORT) {
			return buffer.getShort();
		}
		return possibleLength;
	}

}