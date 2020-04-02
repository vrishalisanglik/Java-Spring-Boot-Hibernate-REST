package com.techiernote.collection.queue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {

	public Buffer() {
		blockingQueue = new ArrayBlockingQueue(1);
	}

	public void get() {
		try {
			System.out.println((new StringBuilder("Consumer received - ")).append(blockingQueue.take()).toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void put(int data) {
		try {
			blockingQueue.put(Integer.valueOf(data));
			System.out.println((new StringBuilder("Producer produced - ")).append(data).toString());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private BlockingQueue blockingQueue;
}
