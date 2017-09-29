package test;

import java.util.Random;

/**
 * Runnable 用法测试
 * @author LinTeX9527
 *
 */
public class RunnableTest {

	public static void main(String[] args) {
		
		// ---------------------------------------------
		RunnableTest test = new RunnableTest();
		// ---------------------------------------------
		
		Thread s1 = new Thread(test.new Singer("A", 3));
		Thread s2 = new Thread(test.new Singer("JAMES", 4));
		Thread s3 = new Thread(test.new Singer("D", 5));
		
		s1.start();
		s2.start();
		s3.start();
	}

	
	/**
	 * 自定义类实现 Runnable 接口
	 * @author LinTeX9527
	 *
	 */
	private class Singer implements Runnable{

		private String name;
		private int count;
		
		public Singer(String name, int count) {
			super();
			this.name = name;
			this.count = count;
			System.out.println(name + " : " + count);
		}


		@Override
		public void run() {
			for (int i = 0; i < count; i ++){
				try {
					
					Random r = new Random();
					r.setSeed(100);
					int time = r.nextInt() % 1000;
					Thread.sleep(Math.abs(time));
					
					System.out.println(name + " at " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
