package com.rutter.simulationrecord;

/**
 * Stores information when a message was received (used by MessageRecord).
 */
public class ReceptionRecord {

	private long clientID;
	private int timestamp;

	public ReceptionRecord(long client, int time) {
		this.clientID = client;
		this.timestamp = time;
	}

	public long getClientID() {
		return clientID;
	}

	public int getTimestamp() {
		return timestamp;
	}
}
