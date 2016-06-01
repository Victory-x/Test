package com.run;

/**
 * Created by Administrator on 2016/6/1.
 */

/**
 * �򵥶��̳߳��� ʵ��runnable �ӿ��е�run����
 * �൱�ڶ��̵߳��������࣬��Ҫ�Ǹ���˳����ĳ������
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
