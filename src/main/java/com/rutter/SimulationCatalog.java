package com.rutter;

import com.Simulation.SimulationController;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.rutter.ConfigurationPage.loadSimulationConfigurations;

public class SimulationCatalog extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel simulationPanel = new JPanel();
    private ArrayList<JRadioButton> simulationConfigurationRadioboxes = new ArrayList<JRadioButton>();

    private ArrayList<SimulationConfiguration> simulationConfigurations;
    private JLabel simulationConfigLabel;
    private JRadioButton[] simulationConfigJRadioButtons;

    private JButton runSimulationButton;
    private StartUpPage startUpPage;
    private ButtonGroup buttonGroup;

    public SimulationCatalog(StartUpPage startUpPage) {
        this.startUpPage = startUpPage;
        setTitle("Simulation Configuration Catalog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(simulationPanel);

        Dimension windowSize = new Dimension(800, 600);
        setPreferredSize(windowSize);

        simulationPanel.setLayout(new GridLayout(0, 1));

        simulationConfigLabel = new JLabel("Select Desired Configuration");
        simulationPanel.add(simulationConfigLabel);

        simulationConfigurations = loadSimulationConfigurations("SimulationConfiguration2.json");

        int simulationConfigurationsSize = simulationConfigurations.size();

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

            System.out.println(simulationConfig.toString());
        }

        setSimulationPanelComponents(simulationConfigurationsSize);

        pack();
        setLocationRelativeTo(null); // Center the window on the screen
//        setVisible(true);
    }

    private void setSimulationPanelComponents(int simulationConfigurationsSize) {
        simulationConfigJRadioButtons = new JRadioButton[simulationConfigurationsSize];
        buttonGroup = new ButtonGroup();

        for (int i = 0; i < simulationConfigurationsSize; i++) {
            String checkBoxLabel = simulationConfigurations.get(i).getName().toString();
            simulationConfigJRadioButtons[i] = new JRadioButton(checkBoxLabel);
            buttonGroup.add(simulationConfigJRadioButtons[i]);
            simulationConfigurationRadioboxes.add(simulationConfigJRadioButtons[i]);
            simulationPanel.add(simulationConfigJRadioButtons[i]);
        }

        runSimulationButton = new JButton("Run Simulation");
        runSimulationButton.addActionListener(runSimulation());

//        JPanel buttonPanel = new JPanel();
        simulationPanel.add(runSimulationButton);

        JButton repaintButton = new JButton("Return to Start Up Page");
        repaintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCatalogPanel();
                dispose(); // Close the RadarCatalog JFrame
                startUpPage.setVisible(true); // Show the StartUpPage JFrame
            }
        });
        simulationPanel.add(repaintButton);

        pack();
        setLocationRelativeTo(null); // Center the window on the screen
    }

    public void updateCatalogPanel() {
        simulationPanel.removeAll();
        simulationPanel.add(simulationConfigLabel);
        simulationConfigurationRadioboxes.clear();

//        for ( SimulationConfiguration simulationConfiguration : simulationConfigurations) {
//            String simulationConfigName = simulationConfiguration.getName();
//
//            JRadioButton radioButton = new JRadioButton(simulationConfigName);
//            simulationPanel.add(radioButton);
//        }
        simulationConfigurations = loadSimulationConfigurations("SimulationConfiguration2.json");

        int simulationConfigurationsSize = simulationConfigurations.size();
        setSimulationPanelComponents(simulationConfigurationsSize);

        simulationPanel.revalidate();
        simulationPanel.repaint();
    }

    //TODO ADD A NEW CONSTRUCTOR IN SIMULATIONCONTROLLER THAT ACCESPTS a string as parameter
    public ActionListener runSimulation() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimulationConfiguration simConfig = getSingleSimulationConfiguration(getSelectedSimulationConfigName());
//                new SimulationController(simConfig);//TODO
            }
        };
    }

    public String getSelectedSimulationConfigName() {
        for (int i = 0; i < simulationConfigurationRadioboxes.size(); i++) {
            if (simulationConfigurationRadioboxes.get(i).isSelected()) {
                System.out.println("the selected checkbox has name: " + simulationConfigurations.get(i).getName());
                buttonGroup.clearSelection();
                return simulationConfigurations.get(i).getName();
            }
        }
        return "no matches found";
    }

    public SimulationConfiguration getSingleSimulationConfiguration(String selectedConfigurationName) {
        String filePath = "SimulationConfiguration2.json";
        List<SimulationConfiguration> simulationConfigurations = null;
        SimulationConfiguration selectedConfiguration = null;
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
                        consumerQuantityMap,
                        name);

                if (selectedConfigurationName.equals(name)) {
                    selectedConfiguration = simulationConfig;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("selectedConfiguration: " + selectedConfiguration.toString());
        return selectedConfiguration;
    }

//    public static void main(String[] args) {
//        new SimulationCatalog();
//    }
}
