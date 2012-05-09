package com.vinitello.packet;

import com.google.inject.ImplementedBy;
import com.vinitello.packet.base.BasePacketService;

@ImplementedBy(BasePacketService.class)
public interface PacketService extends PacketBuilder, PacketParser {

	public boolean registerBuilder(Class<? extends PacketBuilder> builder);
	public boolean registerParser(Class<? extends PacketParser> parser);

}