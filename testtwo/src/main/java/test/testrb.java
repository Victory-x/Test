package test;

import com.ThreadTest;

/**
 * Created by Administrator on 2016/6/1.
 */
public class testrb {
	/**
	 *
	 * @param ���������ĸ��̣߳�ÿ���̵߳��õ���ͬһ��ThreadTest�����е�run()����
	 * 		�����ʵ���ͬһ�������еı��� ��tickets����ʵ��
	 */
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
	}
}
