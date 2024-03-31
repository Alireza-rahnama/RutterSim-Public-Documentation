package com.rutter.simulationrecord;

/**
 * Represents an event of a client disconnecting or connecting.
 */
public class ClientConnectionRecord {

	public enum EventType {
		CONNECTION_ESTABLISHED, PLANNED_DISCONNECTION, UNPLANNED_DISCONNECTION
	}

	private long clientID;
	private int timeOfEvent;
	private int plannedDisconnectionTime;
	private EventType eventType;
	private String errorString;

	/**
	 * Create a ClientActionRecord with no error details.
	 * 
	 * @param clientID       ID of client performing action.
	 * @param evntTime       Time since epoch event occurred (ex. time connection
	 *                       occurred).
	 * @param disconnectTime Time since epoch the client will disconnect.
	 * @param type           Event type (use ClientActionRecord.EventType enum).
	 */
	public ClientConnectionRecord(long clientID, int evntTime, int disconnectTime, EventType type) {
		this.clientID = clientID;
		this.timeOfEvent = evntTime;
		this.plannedDisconnectionTime = disconnectTime;
		this.eventType = type;
	}

	/**
	 * Create a ClientActionRecord with error details.
	 * 
	 * @param clientID    ID of client performing action.
	 * @param evntTime    Time since epoch event occurred (ex. time connection
	 *                    occurred).
	 * @param errorString Information about error.
	 * @param type        Event type (use ClientActionRecord.EventType enum).
	 */
	public ClientConnectionRecord(int clientID, int evntTime, String errorString, EventType type) {
		this.clientID = clientID;
		this.timeOfEvent = evntTime;
		this.errorString = errorString;
		this.eventType = type;
	}

	public long getClientID() {
		return clientID;
	}

	public int getTimeOfEvent() {
		return timeOfEvent;
	}

	public int getPlannedDisconnectionTime() {
		return plannedDisconnectionTime;
	}

	public EventType getEventType() {
		return eventType;
	}

	public String getErrorString() {
		return errorString;
	}

}
