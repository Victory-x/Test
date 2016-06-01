package com;

/**
 * Created by Administrator on 2016/6/1.
 */
public class ThreadTest extends Thread {
	private int ticket = 100;
	public void run() {
		while (true) {
			if (ticket > 0) {
				System.out.print(Thread.currentThread().getName() +
						"\n AAA " + ticket--);
			} else {
				break;
			}
		}
	}
}
