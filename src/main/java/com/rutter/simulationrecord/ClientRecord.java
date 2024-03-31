package com.rutter.simulationrecord;

/**
 * Stores information about a client.
 */
public class ClientRecord {

	public enum ClientType {
		CONSUMER, PRODUCER
	}

	private long clientID;
	private ClientType type;

	public ClientRecord(long id, ClientType type) {
		this.clientID = id;
		this.type = type;
	}

	public long getClientID() {
		return clientID;
	}

	public ClientType getType() {
		return type;
	}

}
