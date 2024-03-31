package com.rutter.simulationrecord;

import java.util.HashMap;
import java.util.UUID;

public class Report {
	
	private UUID simID;
	private long simStartTime;
	private long simEndTime;
	
	private int messagesSent = 0;
	private int messagesReceived = 0;
	
	private HashMap<String, MessageRecord> messageRecords;
	
	public Report(SimulationTranscript transcript) {
		messageRecords = transcript.getMessageRecords();
		
		simID = transcript.getRecordID();
		simStartTime = transcript.getStartTime();
		simEndTime = transcript.getEndTime();
		
		messagesSent = messageRecords.size();
		messagesReceived = transcript.getReceivedCount();
		
		// Time of fault metric
		// Number of active client connections when a fault occurs
		// Fault details
		// Average number of messages/bytes per second when fault occurs
		// Average uptime of connection
		// Average latency between receive and send messages
		
		
	}

	public UUID getSimID() {
		return simID;
	}

	public long getSimStartTime() {
		return simStartTime;
	}

	public long getSimEndTime() {
		return simEndTime;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

	public int getMessagesReceived() {
		return messagesReceived;
	}
	
}
