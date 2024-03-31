package com.rutter;

import com.producerClient.AisMessageProvider;
import com.producerClient.PngImageMessageProvider;
import com.rutter.simulationrecord.SimulationTranscript;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class ConsumerClient {
	private final String id;
	private String type;

	public ConsumerClient(String type) {
		this.id = UUID.randomUUID().toString();
		this.type = type;

	}

	@Override
	public String toString() {
		return "ConsumerClient [id=" + id + ", type=" + type + "]";
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void openStreamsAndReceiveMessagesFromS6Node() {

		com.producerClient.ConsumerClient consumerClient = new com.producerClient.ConsumerClient();

		CompletableFuture.runAsync(() -> {

			consumerClient.receivePngImageStream();
		});

		CompletableFuture.runAsync(() -> {

			consumerClient.receiveAisToSeaviewMessageStream();
		});
	}

}
