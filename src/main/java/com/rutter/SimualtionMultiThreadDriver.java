package com.rutter;

import com.producerClient.ConsumerClient;
import com.producerClient.PngImageMessageProvider;
import com.rutter.simulationrecord.SimulationTranscript;

public class SimualtionMultiThreadDriver {
	
	public SimualtionMultiThreadDriver(SimulationTranscript transcript) {
        Thread senderThread = new Thread(new SenderRunnable(transcript));
        
//        senderThread.start();
//        try {
//			Thread.sleep(1000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        Thread receiverThread = new Thread(new ReceiverRunnable());

        senderThread.start();
        receiverThread.start();
	}
	
	
	private class SenderRunnable implements Runnable {
		SimulationTranscript simTranscript;
		public SenderRunnable(SimulationTranscript transcript) {
			simTranscript = transcript;
		}
		
	    @Override
	    public void run() {
			PngImageMessageProvider client = new PngImageMessageProvider(simTranscript);
			client.sendPngImageStream();
//			client.shutdown();
	    }
	}

	private class ReceiverRunnable implements Runnable {
	    @Override
	    public void run() {
			ConsumerClient consumerClient = new ConsumerClient();
			consumerClient.receivePngImageStream();
//			consumerClient.shutdown();
	    }
	}


}
