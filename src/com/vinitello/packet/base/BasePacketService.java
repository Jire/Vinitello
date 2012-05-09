package com.vinitello.packet.base;

import java.util.HashMap;
import java.util.Map;

import com.vinitello.packet.Packet;
import com.vinitello.packet.PacketBuilder;
import com.vinitello.packet.PacketParser;
import com.vinitello.packet.PacketRepresentation;
import com.vinitello.packet.PacketService;
import com.vinitello.packet.annotate.BuildsPacket;
import com.vinitello.packet.annotate.ParsesPacket;

public class BasePacketService implements PacketService {

	private final Map<Class<? extends PacketRepresentation>, PacketBuilder> builders;
	private final Map<Integer, PacketParser> parsers;

	protected BasePacketService(int initialRegistryCapacity) {
		builders = new HashMap<>(initialRegistryCapacity);
		parsers = new HashMap<>(initialRegistryCapacity);
	}

	@Override
	public Packet build(PacketRepresentation packetRep) {
		PacketBuilder builder = builders.get(packetRep.getClass());
		if (builder != null) {
			return builder.build(packetRep);
		}
		return null;
	}

	@Override
	public PacketRepresentation parse(Packet packet) {
		PacketParser parser = parsers.get(packet.getId());
		if (parser != null) {
			return parser.parse(packet);
		}
		return null;
	}

	@Override
	public boolean registerBuilder(Class<? extends PacketBuilder> builder) {
		Object object = null;
		try {
			object = builder.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		BuildsPacket annotation = builder.getAnnotation(BuildsPacket.class);
		if (annotation != null) {
			builders.put(annotation.value(), (PacketBuilder) object);
			return true;
		}
		return false;
	}

	@Override
	public boolean registerParser(Class<? extends PacketParser> parser) {
		Object object = null;
		try {
			object = parser.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		ParsesPacket annotation = parser.getAnnotation(ParsesPacket.class);
		if (annotation != null) {
			for (int packetId : annotation.value()) {
				parsers.put(packetId, (PacketParser) object);
			}
			return true;
		}
		return false;
	}

}