package com.techiernote.collection.queue.arrayblockingqueue;

import java.util.Random;

public class Producer implements Runnable {

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		do {
			Random random = new Random();
			int data = random.nextInt(1000);
			buffer.put(data);
		} while (true);
	}

	private Buffer buffer;
}
