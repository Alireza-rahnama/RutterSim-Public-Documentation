package com.rutter.simulationrecord;

import java.util.ArrayList;

/**
 * Stores information about a message sent by producer, and reception of such
 * message.
 */
public class MessageRecord {

	private String messageID;
	private long transmissionTime; // Millisecond time since epoch.
	private String messageType;
	private int messageSize;
	private int messageOriginID;
	private ArrayList<ReceptionRecord> receptionRecords;
	// consider adding hash of message to verify integrity of message.

	public MessageRecord(String msgID, long time, String msgType, int msgSize, int originID) {
		this.messageID = msgID;
		this.transmissionTime = time;
		this.messageType = msgType;
		this.messageSize = msgSize;
		this.messageOriginID = originID;
		receptionRecords = new ArrayList<ReceptionRecord>();
	}

	public void recordReception(int clientID, int time) {
		receptionRecords.add(new ReceptionRecord(clientID, time));
	}

	public String getMessageID() {
		return messageID;
	}

	public long getTransmissionTime() {
		return transmissionTime;
	}

	public String getMessageType() {
		return messageType;
	}

	public int getMessageSize() {
		return messageSize;
	}

	public int getMessageOriginID() {
		return messageOriginID;
	}

	public ArrayList<ReceptionRecord> getReceptionRecords() {
		return receptionRecords;
	}

}
