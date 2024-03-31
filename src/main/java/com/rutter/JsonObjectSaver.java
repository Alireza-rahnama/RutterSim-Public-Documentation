//package com.rutter;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class JsonObjectSaver {
//
//    private ObjectMapper objectMapper;
//
//    public JsonObjectSaver() {
//        this.objectMapper = new ObjectMapper();
//    }
//
//    public void saveObjectAsJson(Object object, String filePath) throws IOException {
//        objectMapper.writeValue(new File(filePath), object);
//    }
//
//    public SimulationConfiguration readJsonFile(String filePath) throws IOException {
//        try {
//            // Create an ObjectMapper instance
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            // Read the JSON file into a JsonNode object
//            JsonNode jsonNode = objectMapper.readTree(new File(filePath));
//
//            // Access the "radarQuantityMap" property
//            JsonNode radarQuantityMapNode = jsonNode.get("radarQuantityMap");
//
//            HashMap<RadarStation,Integer> radarQuantityMap = new HashMap<>();
//            // Iterate over the radarQuantityMap properties
//            if (radarQuantityMapNode != null && radarQuantityMapNode.isObject()) {
//                for (JsonNode entry : radarQuantityMapNode) {
//                    String uniqeId = entry.get("uniqeId").asText();
//                    String type = entry.get("type").asText();
//                    int dataTransmitionInterval = entry.get("dataTransmitionInterval").asInt();
//                    System.out.println("Key: " + key);
//                    System.out.println("Value: " + value);
//                    RadarStation radar = new RadarStation(type);
//                    int quantity =
//                    radarQuantityMap.put(radar,)
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return SimulationConfiguration()
//    }
//
//
//}
