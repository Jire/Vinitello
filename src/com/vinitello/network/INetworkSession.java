package com.vinitello.network;

import java.net.Socket;

import com.google.inject.ImplementedBy;
import com.vinitello.network.base.BaseNetworkSession;

@ImplementedBy(BaseNetworkSession.class)
public interface INetworkSession extends AutoCloseable {

	public Socket getSocket();

}