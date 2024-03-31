package com.rutter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import static com.rutter.ConfigurationPage.SIMULATION_CONSUMERS_CONFIGURATION;
import static com.rutter.ConfigurationPage.SIMULATION_RADARS_CONFIGURATION;

public class SimulationConfiguration {
    private int simulationPeriod;
    private String simulationId;
    private HashMap<RadarStation, Integer> radarQuantityMap;
    private HashMap<ConsumerClient, Integer> consumerQuantityMap;
    private String name;

    public SimulationConfiguration(int simulationPeriod,
                                   HashMap<RadarStation, Integer> radarQuantityMap,
                                   HashMap<ConsumerClient, Integer> consumerQuantityMap) {

        this.simulationPeriod = simulationPeriod;
        this.radarQuantityMap = radarQuantityMap;
        this.consumerQuantityMap = consumerQuantityMap;
        this.simulationId = UUID.randomUUID().toString();
    }

    public SimulationConfiguration(int simulationPeriod,
                                   HashMap<RadarStation, Integer> radarQuantityMap,
                                   HashMap<ConsumerClient, Integer> consumerQuantityMap,
                                   String name) {

        this.simulationPeriod = simulationPeriod;
        this.radarQuantityMap = radarQuantityMap;
        this.consumerQuantityMap = consumerQuantityMap;
        this.simulationId = UUID.randomUUID().toString();
        this.name = name;
    }

    // Parameterized constructor
    public SimulationConfiguration(int simulationPeriod,
                                   String simulationId,
                                   HashMap<RadarStation, Integer> radarQuantityMap,
                                   HashMap<ConsumerClient, Integer> consumerQuantityMap,
                                   String name) {

        this.simulationPeriod = simulationPeriod;
        this.simulationId = simulationId;
        this.radarQuantityMap = radarQuantityMap;
        this.consumerQuantityMap = consumerQuantityMap;
        this.name = name;
    }

    public SimulationConfiguration(int simulationPeriod,
                                   String simulationId,
                                   HashMap<RadarStation, Integer> radarQuantityMap,
                                   HashMap<ConsumerClient, Integer> consumerQuantityMap) {

        this.simulationPeriod = simulationPeriod;
        this.simulationId = simulationId;
        this.radarQuantityMap = radarQuantityMap;
        this.consumerQuantityMap = consumerQuantityMap;
        this.name = "simulation" + new Random().nextLong();
    }

    public SimulationConfiguration() {
        // Default constructor without arguments
    }

    public int getSimulationPeriod() {
        return simulationPeriod;
    }

    public void setRadarQuantityMap(HashMap<RadarStation, Integer> radarQuantityMap) {
        this.radarQuantityMap = radarQuantityMap;
    }

    public HashMap<ConsumerClient, Integer> getConsumerQuantityMap() {
        return consumerQuantityMap;
    }

    public void setConsumerQuantityMap(HashMap<ConsumerClient, Integer> consumerQuantityMap) {
        this.consumerQuantityMap = consumerQuantityMap;
    }

    public HashMap<RadarStation, Integer> getRadarQuantityMap() {
        return radarQuantityMap;
    }

    public void setSimulationPeriod(int simulationPeriod) {
        this.simulationPeriod = simulationPeriod;
    }

    public void instantiateRadars(HashMap<RadarStation, Integer> radarQuantityMap) {

        List<String> radarsTypeList = radarQuantityMap.keySet().stream().map(s -> s.getType()).toList();
        List<Integer> radarsQuantityList = radarQuantityMap.values().stream().toList();
        List<String> radarsCatalogList = new ArrayList<>();
        try (PrintWriter out = new PrintWriter(new FileWriter(SIMULATION_RADARS_CONFIGURATION, true))) {
            int index = 0;
            for (int radarQuant : radarsQuantityList) {
                for (int i = 0; i < radarQuant; i++) {
                    RadarStation newRadar = new RadarStation(radarsTypeList.get(index));
                    System.out.println(newRadar.getType());
                    radarsCatalogList.add(newRadar.getType());
                }
                index++;
            }
            radarsCatalogList.stream().forEach(out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void instantiateConsumerClients(HashMap<ConsumerClient, Integer> consumerQuantityMap) {

        List<String> consumerTypeList = consumerQuantityMap.keySet().stream().map(s -> s.getType()).toList();
        List<Integer> consumerQuantityList = consumerQuantityMap.values().stream().toList();
        List<String> consumersCatalogList = new ArrayList<>();

        try (PrintWriter out = new PrintWriter(new FileWriter(SIMULATION_CONSUMERS_CONFIGURATION, true))) {
            int index2 = 0;
            for (int consumerQuant : consumerQuantityList) {
                for (int i = 0; i < consumerQuant; i++) {
                    ConsumerClient newConsumerClient = new ConsumerClient(consumerTypeList.get(index2));
                    System.out.println(newConsumerClient.getType());
//                    out.println(newConsumerClient.getType());
                    consumersCatalogList.add(newConsumerClient.getType());
                }
                index2++;
            }
            consumersCatalogList.stream().forEach(out::println);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HashMap<RadarStation, Integer> radarQuantityMap = new HashMap<>();
        HashMap<ConsumerClient, Integer> consumerQuantityMap = new HashMap<>();

        RadarStation radar1 = new RadarStation("Sea Scan");
        int quantityRadar1 = 3;

        RadarStation radar2 = new RadarStation("Type B");
        int quantityRadar2 = 5;

        radarQuantityMap.put(radar1, quantityRadar1);
        radarQuantityMap.put(radar2, quantityRadar2);

        ConsumerClient client1 = new ConsumerClient("Sea view");
        int quantityClient1 = 1;

        ConsumerClient client2 = new ConsumerClient("S6 Web");
        int quantityClient2 = 2;

        consumerQuantityMap.put(client1, quantityClient1);
        consumerQuantityMap.put(client2, quantityClient2);


//        radarQuantityMap.keySet().stream().map(s -> s.getType()).forEach(System.out::println);
//        radarQuantityMap.entrySet().stream().forEach(System.out::println);

//        radarQuantityMap.entrySet().stream().
//                map(s -> s.getKey()).
//                map(r->new RadarStation(r.getType()).getType()).
//                forEach(System.out::println);

//        List<String> radarsList = radarQuantityMap.keySet().stream().map(s -> s.getType()).toList();
//        System.out.println(radarsList);
        SimulationConfiguration simulationConf = new SimulationConfiguration(10, radarQuantityMap, consumerQuantityMap);
        simulationConf.instantiateRadars(radarQuantityMap);
        simulationConf.instantiateConsumerClients(consumerQuantityMap);

    }

    public String getSimulationId() {
        return simulationId;
    }

    public void setSimulationId(String simulationId) {
        this.simulationId = simulationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimulationConfiguration that = (SimulationConfiguration) o;
        return simulationPeriod == that.simulationPeriod && Objects.equals(simulationId, that.simulationId) && Objects.equals(radarQuantityMap, that.radarQuantityMap) && Objects.equals(consumerQuantityMap, that.consumerQuantityMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simulationPeriod, simulationId, radarQuantityMap, consumerQuantityMap);
    }

    @Override
    public String toString() {
        return "SimulationConfiguration{" +
                "simulationPeriod=" + simulationPeriod +
                ", simulationId='" + simulationId + '\'' +
                ", radarQuantityMap=" + radarQuantityMap +
                ", consumerQuantityMap=" + consumerQuantityMap +
                '}';
    }
}
