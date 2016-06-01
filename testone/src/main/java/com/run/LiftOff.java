package com.run;

/**
 * Created by Administrator on 2016/6/1.
 */

/**
 * 简单多线程程序 实现runnable 接口中的run方法
 * 相当于多线程的任务处理类，主要是负责顺序处理某个任务
 */
public class LiftOff implements Runnable {
	protected int countDown = 10;//default
	private static int taskCount = 0;
	private final int id = taskCount++;
	public LiftOff(){}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	public String status() {
		return "#" + id + "(" +
				(countDown > 0 ? countDown : "Liftoff!") + ").";
	}
	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
	}
}
