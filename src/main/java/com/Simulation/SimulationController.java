package com.Simulation;

public class SimulationController {
    Thread ClientThread;
    Thread RadarThread;
    
    public SimulationController(){
        initializeRadarThread();
        initializeClientThread();
    }

    private void initializeRadarThread(){
        this.RadarThread = new Thread(() -> {
            RadarStationController p = new RadarStationController(60000);
            p.initializeRadars();
        });
    }

    private void initializeClientThread(){
        this.ClientThread = new Thread(() -> {
            // todo: implement client logic
            while (true) {
                System.out.println("[Client Thread]: Unimplemented");
                try {
                    Thread.sleep(250);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void start(){
        this.RadarThread.start();
        this.ClientThread.start();
    }

    public static void main(String[] args) {
        SimulationController p =  new SimulationController();
        p.start();
    }
}
