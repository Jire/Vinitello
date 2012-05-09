package com.vinitello.network.base;

import java.nio.ByteBuffer;

import com.google.inject.Inject;
import com.vinitello.encryption.EncryptionAlgorithm;
import com.vinitello.network.NetworkProtocolDecoder;
import com.vinitello.network.util.ProtocolConstants;
import com.vinitello.packet.Packet;

public abstract class BaseNetworkProtocolDecoder implements NetworkProtocolDecoder {

	private final EncryptionAlgorithm encryptionAlgorithm;

	@Inject
	public BaseNetworkProtocolDecoder(EncryptionAlgorithm encryptionAlgorithm) {
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