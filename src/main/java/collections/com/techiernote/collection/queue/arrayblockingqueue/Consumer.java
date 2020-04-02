package com.techiernote.collection.queue.arrayblockingqueue;

public class Consumer implements Runnable {

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		do
			try {
				buffer.get();
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		while (true);
	}

	private Buffer buffer;
}
