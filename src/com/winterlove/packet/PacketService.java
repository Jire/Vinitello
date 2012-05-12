package com.winterlove.packet;

import com.google.inject.Singleton;
import com.vinitello.packet.base.BasePacketService;

@Singleton
public class PacketService extends BasePacketService {

	protected PacketService() {
		super(256);
	}

}