package test;

import com.ThreadTest;

/**
 * Created by Administrator on 2016/6/1.
 */
public class testtd {
	/**
	 * ThreadTest
	 * @param ���������ĸ�ThreadTest���󣬾͵��ڴ������ĸ���Դ
	 * 		��ÿ����Դ����100��Ʊ��ÿ���̶߳��ڶ��Դ�����Ե���Դ
	 */
	public static void main(String[] args) {
		//һ���̶߳���ֻ������һ���̣߳���������ö��ٱ�start()���������ֻ�� һ���̡߳�
		/*ThreadTest t = new ThreadTest();
		t.start();*/
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
	}
}


