package test;

import com.ThreadTest;

/**
 * Created by Administrator on 2016/6/1.
 */
public class testrb {
	/**
	 *
	 * @param ，创建了四个线程，每个线程调用的是同一个ThreadTest对象中的run()方法
	 * 		，访问的是同一个对象中的变量 （tickets）的实例
	 */
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}
