package com.test;

import com.run.LiftOff;

/**
 * Created by Administrator on 2016/5/31.
 */
public class testlift {
	public static void main(String[] args) {
		//1�������ִ�н��
		LiftOff liftOff=new LiftOff();
		liftOff.run();

		//2������Thread��ִ������
		Thread thread=new Thread(new LiftOff());
		thread.start();
		System.out.println("Watting for the lifting off!");

		//3�����Ӷ���߳�

		for(int i=0;i<5;++i){
			new Thread(new LiftOff()).start();
		}
		System.out.println("Watting for lifting off!");

	/*	//4��ʹ��Executor
		//ExecutorService executorService=Executors.newCachedThreadPool();
		ExecutorService executorService=Executors.newFixedThreadPool(4);
		for(int i=0;i<5;++i){
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();
*/
	}

}
