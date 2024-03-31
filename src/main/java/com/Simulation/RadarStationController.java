package com.Simulation;

import com.producerClient.PngImageMessageProvider;
import com.rutter.simulationrecord.SimulationTranscript;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;

public class RadarStationController {
    ArrayList<Thread> loopThread;
    private final long simulationLengthInMilliseconds;
    public RadarStationController(long simulationLengthInMilliseconds) {
        this.loopThread = new ArrayList<Thread>();
        this.simulationLengthInMilliseconds = simulationLengthInMilliseconds;
    }

    public void initializeRadars(){
        // todo: read from file and add radar accordingly
        addRadar("Station A", 1000);
        addRadar("Station B", 2000);
        addRadar("Station C", 5000);

        for (int i = 0; i < loopThread.size(); i++) {
            Thread thread = loopThread.get(i);
            thread.start();
        }
        

        // Wait for the threads to finish 
        try {
            for (int i = 0; i < loopThread.size(); i++) {
            Thread thread = loopThread.get(i);
            thread.join();
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addRadar(String stationName, int intervalInMilliseconds) {
        AtomicLong begin = new AtomicLong(System.currentTimeMillis());
        AtomicLong end = new AtomicLong(System.currentTimeMillis());
        AtomicLong timePassed = new AtomicLong(0L);
        loopThread.add(new Thread(() -> {
            end.set(System.currentTimeMillis());

            while (timePassed.get() < new AtomicLong(simulationLengthInMilliseconds).get()) {
                buildRadar(stationName, intervalInMilliseconds);
                try {
                    Thread.sleep(intervalInMilliseconds); // Pause the execution for the specified interval
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    // Restore interrupted status if needed
                    Thread.currentThread().interrupt();
                }
                end.set(System.currentTimeMillis());
                timePassed.set(end.get() - begin.get());
            }
        }));
    }


    public void buildRadar(String StationName, int intervalInMilliseconds){
        // tdo: add Radar transmission logic here
        // ProducerClient pc = new ProducerClient();
        // pc.createClientStub();
        // pc.ProducerShakeHands();
        // pc.ProducerSendPngStream();
        SimulationTranscript simulationTranscript = new SimulationTranscript(System.currentTimeMillis());
        PngImageMessageProvider client = new PngImageMessageProvider(simulationTranscript);
//				client.sendPngImageStream();
        CompletableFuture.runAsync(() -> {

            client.sendPngImageStream();

        });
        System.out.println("[RadarStation] [" + intervalInMilliseconds + "] " +"Ping for: " + StationName);
    }

    public static void main(String[] args) {
        RadarStationController p = new RadarStationController(60000);
        p.initializeRadars();
    }
}
