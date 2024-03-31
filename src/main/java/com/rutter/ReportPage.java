package com.rutter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.rutter.simulationrecord.MessageRecord;
import com.rutter.simulationrecord.SimulationTranscript;

public class ReportPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel reportPanel = new JPanel();
	private JPanel faultDetailPanel = new JPanel();
	private JPanel simulationPanel = new JPanel();

	// Report panel.
	private JLabel simIDLabel;
	private JLabel startTimeLabel;
	private JLabel endTimeLabel;
	// private JLabel uptimeLabel;
	// private JLabel latencyLabel;
	private JLabel faultsLabel;
	private JScrollPane faultListScroll;
	private JList<String> faultsList;

	// Fault detail panel.
	private JLabel faultDetailLabel;
	private JScrollPane faultDetailScroll;
	private JList<String> faultDetailList;

	// Simulation Panel.
	private JButton repaintButton = new JButton("Return to Start Up Page");

	// private SimulationTranscript transcript;
	private ArrayList<MessageRecord> messageRecords;

	public ReportPage(StartUpPage startUpPage) {
		setTitle("View Reports");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		add(reportPanel);
		add(faultDetailPanel);
		add(simulationPanel);

		Dimension windowSize = new Dimension(800, 600);
		setPreferredSize(windowSize);

		simIDLabel = new JLabel("Simulation ID: N/A");
		startTimeLabel = new JLabel("Start time: N/A");
		endTimeLabel = new JLabel("End time: N/A");
		// uptimeLabel = new JLabel("Average uptime: N/A");
		// latencyLabel = new JLabel("Average latency: N/A");
		faultsLabel = new JLabel("Messages sent (0 Total):");
		faultsList = new JList<>();
		faultsList.setLayoutOrientation(JList.VERTICAL);
		faultsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		faultListScroll = new JScrollPane(faultsList);
		JPanel reportInner = new JPanel();
		reportInner.setLayout(new BoxLayout(reportInner, BoxLayout.Y_AXIS));
		reportPanel.setLayout(new BorderLayout());
		reportInner.add(simIDLabel);
		reportInner.add(startTimeLabel);
		reportInner.add(endTimeLabel);
		// reportInner.add(uptimeLabel);
		// reportInner.add(latencyLabel);
		reportInner.add(faultsLabel);
		reportPanel.add(reportInner, BorderLayout.PAGE_START);
		reportPanel.add(faultListScroll, BorderLayout.CENTER);

		faultDetailLabel = new JLabel("Message details:");
		faultDetailList = new JList<>();
		faultDetailScroll = new JScrollPane(faultDetailList);
		faultDetailPanel.setLayout(new BorderLayout());
		faultDetailPanel.add(faultDetailLabel, BorderLayout.PAGE_START);
		faultDetailPanel.add(faultDetailScroll, BorderLayout.CENTER);

		simulationPanel.setLayout(new GridLayout(0, 1));
		simulationPanel.add(repaintButton);

		faultsList.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (messageRecords != null && faultsList.getSelectedIndex() >= 0
						&& faultsList.getSelectedIndex() < messageRecords.size()) {
					MessageRecord record = messageRecords.get(faultsList.getSelectedIndex());
					ArrayList<String> details = new ArrayList<>();
					details.add("Message ID: " + record.getMessageID());
					// details.add("Message Origin ID: " + record.getMessageOriginID());
					// details.add("Message Size: " + record.getMessageSize());
					details.add("Message Type: " + record.getMessageType());
					Date transmissionTime = new Date(record.getTransmissionTime());
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
					// date string
					String dateStr = sdf.format(transmissionTime);
					details.add("Message Transmission Time: " + dateStr);
					details.add("Times received: " + record.getReceptionRecords().size());

					faultDetailList.setListData(details.toArray(new String[] {}));
				} else {
					faultDetailList.setListData(new String[] {});
				}

			}
		});

		repaintButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				startUpPage.setVisible(true);
			}
		});
	}

	public void loadTranscript(SimulationTranscript transcript) {
		// this.transcript = transcript;

		Date startDate = new Date(transcript.getStartTime());
		Date endDate = new Date(transcript.getEndTime());

		simIDLabel.setText("Simulation ID: " + transcript.getRecordID());
		// DateFormat.getDateTimeInstance().
		// Instant instant = Instant.ofEpochMilli(transcript.getStartTime());
		startTimeLabel.setText("Start time: " + DateFormat.getDateTimeInstance().format(startDate));
		endTimeLabel.setText("End time: " + DateFormat.getDateTimeInstance().format(endDate));

		// Load message records.
		messageRecords = new ArrayList<>(transcript.getMessageRecords().values());

		// Sort by transmission time.
		messageRecords.sort(new Comparator<MessageRecord>() {
			@Override
			public int compare(MessageRecord o1, MessageRecord o2) {
				return (int) (o1.getTransmissionTime() - o2.getTransmissionTime());
			}
		});
		String[] messages = new String[messageRecords.size()];
		for (int i = 0; i < messageRecords.size(); i++) {
			MessageRecord rec = messageRecords.get(i);
			Date transmissionTime = new Date(rec.getTransmissionTime());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			// date string
			String dateStr = sdf.format(transmissionTime);
			messages[i] = dateStr + " " + rec.getMessageID();
		}

		faultsLabel.setText("Messages sent (" + messages.length + " Total):");
		faultsList.setListData(messages);
	}

}
