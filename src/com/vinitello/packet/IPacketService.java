package com.vinitello.packet;

import com.google.inject.ImplementedBy;
import com.vinitello.packet.base.BasePacketService;

@ImplementedBy(BasePacketService.class)
public interface IPacketService extends IPacketBuilder, IPacketParser {

	public boolean registerBuilder(Class<? extends IPacketBuilder> builder);
	public boolean registerParser(Class<? extends IPacketParser> parser);

}