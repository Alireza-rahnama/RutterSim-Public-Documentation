package com.rutter.simulationrecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import com.rutter.simulationrecord.ClientConnectionRecord.EventType;

/**
 * A simulation record is created each time a simulation is run. It collects
 * data about when a message is sent and when a message is received by one or
 * many clients. It records when a client connects and disconnects, and
 * information about the clients.
 */
public class SimulationTranscript {

	private UUID recordID;
	private long startTime; // Millisecond time since epoch
	private long endTime; // Millisecond time since epoch

	private ArrayList<ClientConnectionRecord> clientActions;
	private ArrayList<ClientRecord> clientRecords;
	private HashMap<String, MessageRecord> messageRecords;
	
	private int receivedCount = 0; // Count that increases each time one client receives one message. 

	public SimulationTranscript(long startTime) {
		recordID = UUID.randomUUID();
		this.startTime = startTime;
		endTime = -1;
		
		clientActions = new ArrayList<ClientConnectionRecord>();
		clientRecords = new ArrayList<ClientRecord>();
		messageRecords = new HashMap<String, MessageRecord>();
		
		receivedCount = 0;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public void addClient(int id, ClientRecord.ClientType type) {
		ClientRecord rec = new ClientRecord(id, type);
		clientRecords.add(rec);
	}

	public void recordConnectionEstablished(int clientID, int time, int schdDisconnectTime) {
		ClientConnectionRecord rec = new ClientConnectionRecord(clientID, time, schdDisconnectTime,
				ClientConnectionRecord.EventType.CONNECTION_ESTABLISHED);
		clientActions.add(rec);
	}

	public void recordUnexpectedDisconnect(int clientID, int evntTime, String errorString, EventType type) {
		ClientConnectionRecord rec = new ClientConnectionRecord(clientID, evntTime, errorString, type);
		clientActions.add(rec);
	}

	/**
	 * @return False if and only if a message was already sent with that ID OR messageID is null.
	 */
	public boolean recordMessageSent(String messageID, long time, String messageType, int messageSize, int originID) {
		MessageRecord rec = new MessageRecord(messageID, time, messageType, messageSize, originID);
		MessageRecord result = messageRecords.put(messageID, rec);
		return result == null;
	}

	/**
	 * Called whenever a message is received.
	 * 
	 * @param messageID ID of message sent contained in the message.
	 * @param clientID  ID of client receiving the message.
	 * @param time      Time (since epoch) message was received.
	 * 
	 * @return Will return false if the messageID was not previously recorded as
	 *         been sent.
	 */
	public boolean recordMessageReceived(String messageID, int clientID, int time) {
		MessageRecord rec = messageRecords.get(messageID);
		if (rec == null) {
			return false;
		}
		rec.recordReception(clientID, time);
		receivedCount++;
		return true;
	}

	public UUID getRecordID() {
		return recordID;
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public ArrayList<ClientConnectionRecord> getClientActions() {
		return clientActions;
	}

	public ArrayList<ClientRecord> getClientRecords() {
		return clientRecords;
	}

	public HashMap<String, MessageRecord> getMessageRecords() {
		return messageRecords;
	}

	public int getReceivedCount() {
		return receivedCount;
	}

}
