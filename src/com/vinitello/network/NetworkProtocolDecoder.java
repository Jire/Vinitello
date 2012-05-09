package com.vinitello.network;

import java.nio.ByteBuffer;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkProtocolDecoder;
import com.vinitello.packet.Packet;

@ImplementedBy(BaseNetworkProtocolDecoder.class)
public interface NetworkProtocolDecoder {

	public Packet decode(ByteBuffer buffer);

}