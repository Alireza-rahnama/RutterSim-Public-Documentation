package com.rutter;

import java.awt.BorderLayout;
import java.util.concurrent.CompletableFuture;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import com.producerClient.AisMessageProvider;
import com.producerClient.PngImageMessageProvider;
import com.rutter.simulationrecord.SimulationTranscript;

public class StartUpPage extends JFrame {

    protected static final JButton configureSimulation = new JButton("Configure Simulation");
    protected static final JButton radarStationCatalog = new JButton("Radar Catalog");
    protected static final JButton consumerClientCatalog = new JButton("Consumer Client Catalog");
    protected static final JButton viewReports = new JButton("View Reports");
    protected static final JButton newSimulation = new JButton("New Simulation");

    private JMenuBar menuBar = new JMenuBar();
    private RadarCatalog radarCatalog;
    private SimulationCatalog simulationCatalog;
    private ConsumerClientCatalog clientCatalog;
    private ConfigurationPage configPage;
    private ReportPage reportPage;
    private Dimension windowSize = new Dimension(800, 600);

    private RunSimulation runSimulation;

    private String backgroundImageFile = "src/main/images/start.png";
    private JLabel backgroundLabel;

    private SimulationTranscript simulationTranscript = null;

    public StartUpPage(String title) throws HeadlessException {
        super(title);

        setPreferredSize(windowSize);

        setJMenuBar(menuBar);

        radarCatalog = new RadarCatalog(this);
        simulationCatalog = new SimulationCatalog(this);

        clientCatalog = new ConsumerClientCatalog(this);
        configPage = new ConfigurationPage(this);
        reportPage = new ReportPage(this);

        configureSimulation.addActionListener(openConfigPage());
        radarStationCatalog.addActionListener(openRadarCatalog());
        consumerClientCatalog.addActionListener(openConsumerClientCatalog());
        viewReports.addActionListener(openReport());
        newSimulation.addActionListener(openNewSimulation());

        menuBar.add(configureSimulation);
        menuBar.add(radarStationCatalog);
        menuBar.add(consumerClientCatalog);
        menuBar.add(viewReports);
        menuBar.add(newSimulation);

        backgroundLabel = new JLabel(new ImageIcon(backgroundImageFile));

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);

        pack();
        setVisible(true);

    }

    private ActionListener openConfigPage() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                // Handle the button click event here
                setVisible(false);
                configPage.setSize(800, 600);
                configPage.setVisible(true);
                repaintWindow();
            }
        };
    }

    private ActionListener openRadarCatalog() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Handle the button click event here
                setVisible(false);
                radarCatalog.setSize(800, 600);
                radarCatalog.setVisible(true);
                repaintWindow();

            }
        };
    }

    private ActionListener openConsumerClientCatalog() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Handle the button click event here
                setVisible(false);
                clientCatalog.setSize(800, 600);
                clientCatalog.setVisible(true);
                repaintWindow();
            }
        };
    }

    private ActionListener openReport() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Handle the button click event here
                setVisible(false);
                reportPage.setSize(reportPage.getPreferredSize());
                if (simulationTranscript != null) {
                    reportPage.loadTranscript(simulationTranscript);
                }
                reportPage.setVisible(true);
                repaintWindow();
            }
        };
    }

    private ActionListener openNewSimulation() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
//				ProducerClient p = new ProducerClient();
//				p.createClient();
//				String Id = p.getNodeID();
//		        // Display an alert with a custom message and title
//		        String message = "Creating Client...\n" + "Channel created successfully!\n"+		
//		        "S6 node ID: " + Id + "\n"+ "Connection established!";
//		        
//		        String title = "Successful Unary Call";
//		        
//		        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
//				runSimulation = new RunSimulation();
//				PngImageMessageProvider client = new PngImageMessageProvider(simulationTranscript);
////				client.sendPngImageStream();
//				CompletableFuture.runAsync(() -> {
//
//					client.sendPngImageStream();
//
//				});
////				client.shutdown();
//
//				AisMessageProvider aisMessageProviderClient = new AisMessageProvider(simulationTranscript);
//				CompletableFuture.runAsync(() -> {
//
//					aisMessageProviderClient.sendAisToSeaviewMessageStream();
//
//				});
//
////				ConsumerClient client2 = new ConsumerClient();
////				client2.receivePngImageStream();
////				client2.shutdown();
//
//
//				// SimualtionMultiThreadDriver simualtionMultiThreadDriver = new SimualtionMultiThreadDriver(simulationTranscript);
//
//				ConsumerClient consumerClient = new ConsumerClient();
////				consumerClient.receivePngImageStream();
////				consumerClient.receivePngImageStream2();
//				CompletableFuture.runAsync(() -> {
//
////		            try {
////		                Thread.sleep(3000);
////
////		            } catch (Throwable t) {
////		                t.printStackTrace();
////		            }
//
//					consumerClient.receivePngImageStream();
////					consumerClient.receiveAisToSeaviewMessageStream();
//
//				});
//
//				CompletableFuture.runAsync(() -> {
//
////		            try {
////		                Thread.sleep(3000);
////
////		            } catch (Throwable t) {
////		                t.printStackTrace();
////		            }
//
//					consumerClient.receiveAisToSeaviewMessageStream();
//
//				});

                ///below are working runnable simulation
//                simulationTranscript = new SimulationTranscript(System.currentTimeMillis());
//
//                RadarStation radarStation = new RadarStation("Sea Scan");
//                radarStation.openStreamsAndSendMessagesToS6Node();
//
//                ConsumerClient consumerClient = new ConsumerClient("Sea View");
//                consumerClient.openStreamsAndReceiveMessagesFromS6Node();

//				SimualtionMultiThreadDriver simualtionMultiThreadDriver = new SimualtionMultiThreadDriver();


                // Handle the button click event here
                setVisible(false);
                simulationCatalog.setSize(800, 600);
                simulationCatalog.updateCatalogPanel();
                simulationCatalog.setVisible(true);
                repaintWindow();
            }
        };
    }

    public static void main(String[] args) {
        new StartUpPage("Performance Benchmarking");

    }


    public void repaintWindow() {
        getContentPane().repaint();

    }

}


