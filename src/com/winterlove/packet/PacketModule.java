package com.winterlove.packet;

import com.google.inject.AbstractModule;
import com.vinitello.packet.IPacketService;

public class PacketModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IPacketService.class).to(PacketService.class);
	}

}