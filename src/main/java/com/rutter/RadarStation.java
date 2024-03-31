package com.rutter;

import com.producerClient.AisMessageProvider;
import com.producerClient.ConsumerClient;
import com.producerClient.PngImageMessageProvider;
import com.rutter.simulationrecord.SimulationTranscript;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class RadarStation {

    @Override
    public String toString() {
        return "RadarStation [uniqeId=" + uniqeId + ", type=" + type + ", dataTransmitionInterval=" + dataTransmitionInterval + "]";
    }

    private final String uniqeId;
    private String type;
    private int dataTransmitionInterval;

    public RadarStation(String type) {
        super();
        this.uniqeId = UUID.randomUUID().toString();
        this.type = type;
    }

    public String getUniqeId() {
        return uniqeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDataTransmitionInterval(int dataTransmitionInterval) {
        this.dataTransmitionInterval = dataTransmitionInterval;
    }

    public int getDataTransmitionInterval() {
        return dataTransmitionInterval;
    }

    public void openStreamsAndSendMessagesToS6Node() {
        SimulationTranscript simulationTranscript = new SimulationTranscript(System.currentTimeMillis());
        PngImageMessageProvider client = new PngImageMessageProvider(simulationTranscript);
        CompletableFuture.runAsync(() -> {
            client.sendPngImageStream();
        });

        AisMessageProvider aisMessageProviderClient = new AisMessageProvider(simulationTranscript);
        CompletableFuture.runAsync(() -> {
            aisMessageProviderClient.sendAisToSeaviewMessageStream();
        });
    }
}
