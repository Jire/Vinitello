package com.winterlove;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.vinitello.task.ITaskService;
import com.winterlove.encryption.EncryptionModule;
import com.winterlove.network.NetworkModule;
import com.winterlove.packet.PacketModule;
import com.winterlove.task.TaskModule;

public final class WinterLove {

	private static final Module[] modules = {
		new NetworkModule(),
		new PacketModule(),
		new EncryptionModule(),
		new TaskModule()
	};

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(modules);

		injector.getInstance(ITaskService.class).start();
	}

}