package com.rutter;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;


import java.io.*;
import java.util.*;

import java.util.List;
import java.util.Map.Entry;

import static com.rutter.RadarCatalog.RADAR_CATALOG_FILE;
import static com.rutter.ConsumerClientCatalog.CONSUMER_CATALOG_FILE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel radarCatalogPanel = new JPanel();
    private JPanel consumerClientCatalogPanel = new JPanel();
    private JPanel simulationPanel = new JPanel();

    private JLabel radarQuantityLabel;
    private JLabel radarTypeLabel;
    private JLabel dataTransmitionPeriodLabel;

    private JLabel consumerClientQuantityLabel;
    private JLabel consumerClientTypeLabel;

    private JLabel simualtionPeriodLabel;
    private JLabel simualtionNameLabel;

    private JLabel[] radarLabels;
    private JCheckBox[] radarCheckBoxes;
    private JTextField[] radarQuantityFields;
    private JTextField[] dataTransmitionIntervalFields;
    private JTextField simulationtionPeriodField;
    private JTextField simulationtionNameField;
    private JCheckBox[] consumerClientCheckBoxes;
    private JTextField[] consumerClientQuantityFields;

    private ArrayList<JCheckBox> radarCheckboxes = new ArrayList<JCheckBox>();
    private ArrayList<String> selectedRadars = new ArrayList<String>();
    private ArrayList<JCheckBox> consumerCheckboxes = new ArrayList<JCheckBox>();
    private ArrayList<Integer> selectedRadarsIndexList = new ArrayList<Integer>();
    private ArrayList<RadarStation> radarList = new ArrayList<RadarStation>();
    private ArrayList<ConsumerClient> consumerList = new ArrayList<ConsumerClient>();

    private ArrayList<RadarStation> radarStations;
    private ArrayList<String> selectedConsumers = new ArrayList<String>();
    private ArrayList<Integer> selectedConsumerClientIndexList = new ArrayList<Integer>();

    private ArrayList<HashMap<RadarStation, Integer>> radarsSimulationConfigurationCatalog = new ArrayList<HashMap<RadarStation, Integer>>();
    private ArrayList<HashMap<ConsumerClient, Integer>> consumerClientSimulationConfigurationCatalog = new ArrayList<HashMap<ConsumerClient, Integer>>();
    private ArrayList<SimulationConfiguration> simulationConfigurationCatalog;

    private HashMap<RadarStation, Integer> radarQuantityMap = new HashMap<>();
    private HashMap<ConsumerClient, Integer> consumerQuantityMap = new HashMap<>();

    private StartUpPage startUpPage;


    private static long configId;

    private SimulationConfiguration simulationConfiguration;
    public static final String SIMULATION_RADARS_CONFIGURATION = "simulationRadarsCatalog.txt";
    public static final String SIMULATION_CONSUMERS_CONFIGURATION = "simulationConsumersCatalog.txt";


    public ConfigurationPage(StartUpPage startUpPage) {
        setTitle("Radar Configuration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(radarCatalogPanel);
        add(consumerClientCatalogPanel);
        add(simulationPanel);

        Dimension windowSize = new Dimension(800, 600);
        setPreferredSize(windowSize);

        radarCatalogPanel.setLayout(new GridLayout(0, 3));

        radarQuantityLabel = new JLabel("Select Radar Type");
        radarCatalogPanel.add(radarQuantityLabel);

        radarQuantityLabel = new JLabel("Enter Radar Quantities");
        radarCatalogPanel.add(radarQuantityLabel);

        dataTransmitionPeriodLabel = new JLabel("Enter Data Transmition Interval in Seconds");
        radarCatalogPanel.add(dataTransmitionPeriodLabel);

        simulationPanel.setLayout(new GridLayout(0, 1));

        simualtionPeriodLabel = new JLabel("Enter Simulation Length in Minutes");
        simulationPanel.add(simualtionPeriodLabel);

        simulationtionPeriodField = new JTextField();
        simulationPanel.add(simulationtionPeriodField);

        simualtionNameLabel = new JLabel("Enter Simulation Name");
        simulationPanel.add(simualtionNameLabel);

        simulationtionNameField = new JTextField();
        simulationPanel.add(simulationtionNameField);

        ArrayList<RadarStation> radars = loadRadarStations();
        radarStations = radars;
        int radarCatalogSize = radarStations.size();

        ArrayList<ConsumerClient> consumerClients = loadConsumerClients();

        radarLabels = new JLabel[radarCatalogSize];
        radarQuantityFields = new JTextField[radarCatalogSize];
        dataTransmitionIntervalFields = new JTextField[radarCatalogSize];
        radarCheckBoxes = new JCheckBox[radarCatalogSize];

        for (int i = 0; i < radarStations.size(); i++) {
            String checkBoxLabel = (radarStations.get(i).getType()).toString();
            radarCheckBoxes[i] = new JCheckBox(checkBoxLabel);
            radarCatalogPanel.add(radarCheckBoxes[i]);
            radarCheckboxes.add(radarCheckBoxes[i]);

            radarQuantityFields[i] = new JTextField();
            radarCatalogPanel.add(radarQuantityFields[i]);

            dataTransmitionIntervalFields[i] = new JTextField();
            radarCatalogPanel.add(dataTransmitionIntervalFields[i]);
        }

        consumerClientCatalogPanel.setLayout(new GridLayout(0, 2));

        consumerClientTypeLabel = new JLabel("Select Consumer Client Type");
        consumerClientCatalogPanel.add(consumerClientTypeLabel);

        consumerClientQuantityLabel = new JLabel("Enter Consumer Client Quantities");
        consumerClientCatalogPanel.add(consumerClientQuantityLabel);

        ArrayList<ConsumerClient> consumerClientsCatalog = loadConsumerClients();

        int consumerClientCatalogSize = consumerClientsCatalog.size();

        consumerClientQuantityFields = new JTextField[consumerClientCatalogSize];
        consumerClientCheckBoxes = new JCheckBox[consumerClientCatalogSize];

        for (int i = 0; i < consumerClientsCatalog.size(); i++) {
            String checkBoxLabel = (consumerClientsCatalog.get(i).getType()).toString();
            consumerClientCheckBoxes[i] = new JCheckBox(checkBoxLabel);
            consumerClientCatalogPanel.add(consumerClientCheckBoxes[i]);
            consumerCheckboxes.add(consumerClientCheckBoxes[i]);

            consumerClientQuantityFields[i] = new JTextField();
            consumerClientCatalogPanel.add(consumerClientQuantityFields[i]);
        }

        JButton saveButton = new JButton("Save");
//        saveButton.addActionListener(saveConfiguration());saveConfiguration2
//        saveButton.addActionListener(saveConfiguration2());
//        saveButton.addActionListener(saveSimulationConfiguration("SimulationConfiguration1.json"));
        saveButton.addActionListener(saveSimulationConfiguration2("SimulationConfiguration2.json"));
//        saveButton.addActionListener(loadSimulationConfiguration("SimulationConfiguration1.json"));


        consumerClientCatalogPanel.add(saveButton);

        simulationPanel.add(saveButton);

        JButton repaintButton = new JButton("Return to Start Up Page");
        repaintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Uncheck all radar checkboxes
                for (JCheckBox checkBox : radarCheckBoxes) {
                    checkBox.setSelected(false);
                }

                // Clear radar quantity fields
                for (JTextField field : radarQuantityFields) {
                    field.setText("");
                }

                // Clear data transmission interval fields
                for (JTextField field : dataTransmitionIntervalFields) {
                    field.setText("");
                }

                // Uncheck all consumer client checkboxes
                for (JCheckBox checkBox : consumerClientCheckBoxes) {
                    checkBox.setSelected(false);
                }

                // Clear consumer client quantity fields
                for (JTextField field : consumerClientQuantityFields) {
                    field.setText("");
                }

                // Clear simulation period field
                simulationtionPeriodField.setText("");
                simulationtionNameField.setText("");

                selectedRadars.clear();
                selectedRadarsIndexList.clear();

                selectedConsumers.clear();
                selectedConsumerClientIndexList.clear();

                // Repaint the frame to reflect the changes
                repaint();
                dispose();
                startUpPage.setVisible(true);
            }
        });

        simulationPanel.add(repaintButton);


        simulationPanel.add(repaintButton);
        add(simulationPanel);

    }

    public ActionListener saveConfiguration() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getSelectedRadarsTypes();
                try {
                    getRadarsPropertiesForSimulationCatalog();
                } catch (IOException E) {
                    E.printStackTrace();
                }

                getSelectedConsumerClientTypes();
                getConsumerClientsPropertiesForSimulationCatalog();

                for (HashMap<RadarStation, Integer> map : radarsSimulationConfigurationCatalog) {
                    for (Entry<RadarStation, Integer> entry : map.entrySet()) {

                        String radarType = entry.getKey().getType();
                        int RadarDataTransmitionInterval = entry.getKey().getDataTransmitionInterval();
                        Integer radarQuantity = entry.getValue();

                        System.out.println("Radar Type: " + radarType + ", Radar's Data Transmition Interval: "
                                + RadarDataTransmitionInterval + "minutes, Radar Quantity: " + radarQuantity);

                        try (PrintWriter out = new PrintWriter(
                                new FileWriter(SIMULATION_RADARS_CONFIGURATION, true))) {

                            out.println(radarType);
                            out.println(RadarDataTransmitionInterval);
                            out.println(radarQuantity);

                        } catch (IOException err) {
                            err.printStackTrace();
                        }
                    }
                }

                for (HashMap<ConsumerClient, Integer> map : consumerClientSimulationConfigurationCatalog) {

                    for (Entry<ConsumerClient, Integer> entry : map.entrySet()) {

                        String clientType = entry.getKey().getType();
                        Integer clientQuantity = entry.getValue();

                        System.out.println("Client Type: " + clientType + ", Client Quantity: " + clientQuantity);

                        try (PrintWriter out = new PrintWriter(
                                new FileWriter(SIMULATION_CONSUMERS_CONFIGURATION, true))) {

                            out.println(clientType);
                            out.println(clientQuantity);

                        } catch (IOException er) {
                            er.printStackTrace();
                        }
                    }
                }

                System.out.println(getSimulationPeriod() + " minutes");

//				simulationConfiguration = new SimulationConfiguration(getSimulationPeriod(),
//						radarsSimulationConfigurationCatalog, consumerClientSimulationConfigurationCatalog);
//
//				saveToSimulationCatalog(simulationConfiguration);
//
//				System.out.println(simulationConfiguration.toString());

            }
        };
    }

    public ActionListener saveConfiguration2() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimulationConfiguration simulationConfiguration = null;
                try {
                    simulationConfiguration = getSimulationConfiguration();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
//                simulationConfiguration.instantiateRadars(simulationConfiguration.getRadarQuantityMap());
//                simulationConfiguration.instantiateConsumerClients(simulationConfiguration.getConsumerQuantityMap());
                instantiateRadars(simulationConfiguration.getRadarQuantityMap());
                instantiateConsumerClients(simulationConfiguration.getConsumerQuantityMap());
//				simulationConfiguration.
//                for (HashMap<RadarStation, Integer> map : radarsSimulationConfigurationCatalog) {
//                    for (Entry<RadarStation, Integer> entry : map.entrySet()) {
//
//                        String radarType = entry.getKey().getType();
//                        int RadarDataTransmitionInterval = entry.getKey().getDataTransmitionInterval();
//                        Integer radarQuantity = entry.getValue();
//
//                        System.out.println("Radar Type: " + radarType + ", Radar's Data Transmition Interval: "
//                                + RadarDataTransmitionInterval + "minutes, Radar Quantity: " + radarQuantity);
//

//                    }
//                }
//
//                for (HashMap<ConsumerClient, Integer> map : consumerClientSimulationConfigurationCatalog) {
//
//                    for (Entry<ConsumerClient, Integer> entry : map.entrySet()) {
//
//                        String clientType = entry.getKey().getType();
//                        Integer clientQuantity = entry.getValue();
//
//                        System.out.println("Client Type: " + clientType + ", Client Quantity: " + clientQuantity);
//
//                        try (PrintWriter out = new PrintWriter(
//                                new FileWriter(SIMULATION_CONSUMERS_CONFIGURATION, true))) {
//
//                            out.println(clientType);
//                            out.println(clientQuantity);
//
//                        } catch (IOException er) {
//                            er.printStackTrace();
//                        }
//                    }
//                }

                System.out.println(getSimulationPeriod() + " minutes");

//				simulationConfiguration = new SimulationConfiguration(getSimulationPeriod(),
//						radarsSimulationConfigurationCatalog, consumerClientSimulationConfigurationCatalog);
//
//				saveToSimulationCatalog(simulationConfiguration);
//
//				System.out.println(simulationConfiguration.toString());

            }
        };
    }

    public ArrayList<String> getSelectedRadars() {
        return selectedRadars;
    }

    public void getSelectedRadarsTypes() {
        for (JCheckBox checkBox : radarCheckboxes) {
            if (checkBox.isSelected()) {
                selectedRadars.add(checkBox.getText());
                selectedRadarsIndexList.add(radarCheckboxes.indexOf(checkBox));
            }
        }
    }

    private ArrayList<RadarStation> loadRadarStations() {
        File file = new File(RADAR_CATALOG_FILE);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String radarType = scanner.nextLine();
                radarList.add(new RadarStation(radarType));
            }
        } catch (FileNotFoundException e) {
            // if File does not exist, do nothing.
        }
        return radarList;
    }

    public ArrayList<ConsumerClient> loadConsumerClients() {
        File file = new File(CONSUMER_CATALOG_FILE);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String consumerClientType = scanner.nextLine();
                consumerList.add(new ConsumerClient(consumerClientType));
            }
        } catch (FileNotFoundException e) {
            // File does not exist yet, do nothing.
        }
        return consumerList;
    }

    public HashMap<RadarStation, Integer> getRadarsPropertiesForSimulationCatalog() throws IOException {
        HashMap<RadarStation, Integer> selectedRadarQuantityMap = new HashMap<>();

        for (int i = 0; i < selectedRadars.size(); i++) {
            RadarStation radar = new RadarStation(selectedRadars.get(i));
//            int quantity = Integer.parseInt(radarQuantityFields[selectedRadarsIndexList.get(i)].getText());
            String quantityText = radarQuantityFields[selectedRadarsIndexList.get(i)].getText();
            int quantity = 0;
            if (!quantityText.isEmpty()) {
                quantity = Integer.parseInt(quantityText);
            } else {
                System.out.println("please input a valid quantity for radar" + radar.getType());
            }
            selectedRadarQuantityMap.put(radar, quantity);
//			radarsSimulationConfigurationCatalog.add(selectedRadarQuantityMap);
        }
        return selectedRadarQuantityMap;

    }

    public void getSelectedConsumerClientTypes() {
        for (JCheckBox checkBox : consumerCheckboxes) {
            if (checkBox.isSelected()) {
                selectedConsumers.add(checkBox.getText());
                selectedConsumerClientIndexList.add(consumerCheckboxes.indexOf(checkBox));
            }
        }
    }

    public HashMap<ConsumerClient, Integer> getConsumerClientsPropertiesForSimulationCatalog() {
        HashMap<ConsumerClient, Integer> selectedConsumerQuantityMap = new HashMap<>();
        for (int i = 0; i < selectedConsumers.size(); i++) {
            ConsumerClient consumerClient = new ConsumerClient(selectedConsumers.get(i));
            int quantity = Integer
                    .parseInt(consumerClientQuantityFields[selectedConsumerClientIndexList.get(i)].getText());
            selectedConsumerQuantityMap.put(consumerClient, quantity);
//			consumerClientSimulationConfigurationCatalog.add(selectedConsumerQuantityMap);
        }
        return selectedConsumerQuantityMap;

    }

    public int getSimulationPeriod() {
        try {
            return Integer.parseInt(simulationtionPeriodField.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public String getSimulationName() {
        try {
            return simulationtionNameField.getText();
        } catch (Throwable e) {
            return "No Name Assigned";
        }
    }

    public SimulationConfiguration getSimulationConfiguration() throws IOException {
        getSelectedRadarsTypes();
        HashMap<RadarStation, Integer> radarQuantityMap = getRadarsPropertiesForSimulationCatalog();

        getSelectedConsumerClientTypes();
        HashMap<ConsumerClient, Integer> consumerQuantityMap = getConsumerClientsPropertiesForSimulationCatalog();

        int simulationPeriod = getSimulationPeriod();
        String simulationName = getSimulationName();
        return new SimulationConfiguration(simulationPeriod, radarQuantityMap, consumerQuantityMap,simulationName);

//		try (PrintWriter out = new PrintWriter(new FileWriter(SIMULATION_RADARS_CONFIGURATION, true))) {
//			out.println(simulationConfiguration.getSimulationPeriod());
////			out.println(simulationConfiguration.getRadarsSimulationConfigurationCatalog());
////			out.println(simulationConfiguration.getConsumerClientSimulationConfigurationCatalog());
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    }

//    public void loadSimulationCatalog() {
//        simulationConfigurationCatalog.clear();
//        File file = new File(SIMULATION_RADARS_CONFIGURATION);
//        try (Scanner scanner = new Scanner(file)) {
//            while (scanner.hasNextLine()) {
//            	String RadarType = scanner.nextLine();
//                int simulationPeriod = Integer.parseInt(scanner.nextLine());
//                int radarQuantity = Integer.parseInt(scanner.nextLine());
//
//                for(int i=0; i<radarQuantity; i++) {
//
//                }
//            }
//        } catch (FileNotFoundException e) {
//            // If the file does not exist, do nothing.
//        }
//    }

    public void instantiateRadars(HashMap<RadarStation, Integer> radarQuantityMap) {

        java.util.List<String> radarsTypeList = radarQuantityMap.keySet().stream().map(s -> s.getType()).toList();
        java.util.List<Integer> radarsQuantityList = radarQuantityMap.values().stream().toList();
        java.util.List<String> radarsCatalogList = new ArrayList<>();
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

        java.util.List<String> consumerTypeList = consumerQuantityMap.keySet().stream().map(s -> s.getType()).toList();
        java.util.List<Integer> consumerQuantityList = consumerQuantityMap.values().stream().toList();
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

//    public ActionListener saveSimulationConfiguration(String outputFilePath) {
//        JsonObjectSaver objectSaver = new JsonObjectSaver();
//        return new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                SimulationConfiguration simulationConfiguration = null;
//                try {
//                    simulationConfiguration = getSimulationConfiguration();
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//
//                try {
//                    objectSaver.saveObjectAsJson(simulationConfiguration, outputFilePath);
//                    System.out.println("simulationConfiguration saved as JSON successfully.");
//                } catch (IOException ioe) {
//                    System.err.println("Error occurred while saving simulationConfiguration as JSON: " + ioe.getMessage());
//                }
//
//            }
//        };
//    }

//    public ActionListener loadSimulationConfiguration(String outputFilePath) {
    //JSON parser object to parse read file
//        JSONParser jsonParser = new JSONParser();
//
//        try (FileReader reader = new FileReader("employees.json"))
//        {
//            //Read JSON file
//            Object obj = jsonParser.parse(reader);
//
//            JSONArray employeeList = (JSONArray) obj;
//            System.out.println(employeeList);
//
//            //Iterate over employee array
//            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


//        JsonObjectSaver objectSaver = new JsonObjectSaver();
//        return new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                SimulationConfiguration simulationConfiguration = null;
//
//
//                try {
//                    SimulationConfiguration LoadedSimulationConfiguration = objectSaver.readJsonFile(outputFilePath);
//                    System.out.println("simulationConfiguration: " + LoadedSimulationConfiguration);
//                } catch (IOException ioe) {
//                    System.err.println("Error occurred while saving simulationConfiguration as JSON: " + ioe.getMessage());
//                }
//
//            }
//        };
//    }

    public ActionListener saveSimulationConfiguration2(String outputFilePath) {
        ObjectSaver objectSaver = new ObjectSaver();
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Uncheck all radar checkboxes
//                for (JCheckBox checkBox : radarCheckBoxes) {
//                    checkBox.setSelected(false);
//                }
//
//                // Clear radar quantity fields
//                for (JTextField field : radarQuantityFields) {
//                    field.setText("");
//                }
//
//                // Clear data transmission interval fields
//                for (JTextField field : dataTransmitionIntervalFields) {
//                    field.setText("");
//                }
//
//                // Uncheck all consumer client checkboxes
//                for (JCheckBox checkBox : consumerClientCheckBoxes) {
//                    checkBox.setSelected(false);
//                }
//
//                // Clear consumer client quantity fields
//                for (JTextField field : consumerClientQuantityFields) {
//                    field.setText("");
//                }
//
                SimulationConfiguration simulationConfiguration = null;
                try {
                    simulationConfiguration = getSimulationConfiguration();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                try {
                    objectSaver.appendObjectToJsonFile(simulationConfiguration, outputFilePath);
                    System.out.println("simulationConfiguration saved as JSON successfully.");
                } catch (IOException ioe) {
                    System.err.println("Error occurred while saving simulationConfiguration as JSON: " + ioe.getMessage());
                }

            }
        };
    }

    public static void main(String[] args) {
        HashMap<RadarStation, Integer> map;
        map = new HashMap<>();

        RadarStation r1 = new RadarStation("sea scan");
        RadarStation r2 = new RadarStation("sea scan2");
        map.put(r1, 2);
        map.put(r2, 3);

        for (Map.Entry<RadarStation, Integer> entry : map.entrySet()) {
            RadarStation radarStation = entry.getKey();
            int quantity = entry.getValue();

            System.out.println("RadarStation Attributes:");
            System.out.println("Type: " + radarStation.getType());
            System.out.println("UniqueId: " + radarStation.getUniqeId());
            System.out.println("DataTransmitionInterval: " + radarStation.getDataTransmitionInterval());
            System.out.println("Quantity: " + quantity);
        }

        try (FileWriter file = new FileWriter("employees.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            JSONObject employeeDetails = new JSONObject();

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //TODO USE THIS To populate the simulationConfiguration for the gui
    public static ArrayList<SimulationConfiguration> loadSimulationConfigurations(String filePath) {

        List<SimulationConfiguration> simulationConfigurations = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            simulationConfigurations = objectMapper.readValue(new File(filePath), new TypeReference<List<SimulationConfiguration>>() {
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
                        consumerQuantityMap);

//                System.out.println(simulationConfig.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<SimulationConfiguration>) simulationConfigurations;
    }
}
