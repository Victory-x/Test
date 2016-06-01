package test;

import com.ThreadTest;

/**
 * Created by Administrator on 2016/6/1.
 */
public class testtd {
	/**
	 * ThreadTest
	 * @param ，创建了四个ThreadTest对象，就等于创建了四个资源
	 * 		，每个资源都有100张票，每个线程都在独自处理各自的资源
	 */
	public static void main(String[] args) {
		//一个线程对象只能启动一个线程，无论你调用多少遍start()方法，结果只有 一个线程。
		/*ThreadTest t = new ThreadTest();
		t.start();*/
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
	}
}


