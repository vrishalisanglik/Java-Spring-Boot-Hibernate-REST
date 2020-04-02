package com.techiernote.collection.queue.arrayblockingqueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayBlockingQueueTest {

	public ArrayBlockingQueueTest() {
	}

	public static void main(String args[]) {
		ExecutorService executorService = null;
		try {
			Buffer buffer = new Buffer();
			executorService = Executors.newFixedThreadPool(2);
			executorService.execute(new Producer(buffer));
			executorService.execute(new Consumer(buffer));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (executorService != null)
			executorService.shutdown();
	}
}
