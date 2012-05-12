package com.vinitello.network;

import java.nio.ByteBuffer;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkProtocolEncoder;
import com.vinitello.packet.Packet;

@ImplementedBy(BaseNetworkProtocolEncoder.class)
public interface INetworkProtocolEncoder {

	public ByteBuffer encode(Packet packet);

}