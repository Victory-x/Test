package com;

/**
 * Created by Administrator on 2016/6/1.
 */
public class RunnableTest implements Runnable {
	private int tickets = 100;
	public void run() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() +
						"BBB" + tickets--);
			}
		}
	}
}
