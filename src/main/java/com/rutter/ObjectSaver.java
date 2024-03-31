package com.rutter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ObjectSaver {

    private ObjectMapper objectMapper;

    public ObjectSaver() {
        this.objectMapper = new ObjectMapper();
    }

    public void appendObjectToJsonFile(SimulationConfiguration newObject, String filePath) throws IOException {
        // Read the existing JSON file and parse it into a List of objects
        List<SimulationConfiguration> existingObjects = readJsonFile(filePath);

        // Add the new object to the existing list
        existingObjects.add(newObject);

        // Write the modified list back to the JSON file
        objectMapper.writeValue(new File(filePath), existingObjects);
    }

    private List<SimulationConfiguration> readJsonFile(String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            // If the file doesn't exist, return an empty list
            return new ArrayList<>();
        }

        return objectMapper.readValue(file, new TypeReference<List<SimulationConfiguration>>() {
        });
    }

    private void readJson(String filePath) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<SimulationConfiguration> simulationConfigurations = objectMapper.readValue(new File(filePath), new TypeReference<List<SimulationConfiguration>>() {
            });

            for (SimulationConfiguration configuration : simulationConfigurations) {
                int simulationPeriod = configuration.getSimulationPeriod();
                String simulationId = configuration.getSimulationId();
                HashMap<RadarStation, Integer> radarQuantityMap = configuration.getRadarQuantityMap();
                HashMap<ConsumerClient, Integer> consumerQuantityMap = configuration.getConsumerQuantityMap();
                String name = configuration.getName();

                SimulationConfiguration simulationConfig = new SimulationConfiguration(
                        simulationPeriod,
                        simulationId,
                        radarQuantityMap,
                        consumerQuantityMap,
                        name);

                System.out.println(simulationConfig.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ObjectSaver o = new ObjectSaver();
        List<SimulationConfiguration> l = null;
        o.readJson("SimulationConfiguration2.json");
    }
}

