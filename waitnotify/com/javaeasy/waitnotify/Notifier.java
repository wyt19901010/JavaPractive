package com.javaeasy.waitnotify;

public class Notifier implements Runnable {

	private Object notifyObj; 			// 将在此对象上调用notify()方法

	public Notifier(Object notifyObj) {// 构造方法，传入一个对象的引用
		this.notifyObj = notifyObj;
	}

	public void run() { 				// 覆盖抽象方法run()
		String name = Thread.currentThread().getName();
		// 为了让程序运行结果明显，让负责唤醒的线程先挂起5秒钟
		System.out.println(name + "：将挂起5秒钟");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("对不起，程序运行出错，错误信息为：" +
			e.getMessage());
		}
		// 在调用notify ()方法之前，向控制台输出一段文字
		System.out.println(name + "：开始notify线程");
		synchronized (notifyObj) {		// 获得notifyObj的对象锁
			notifyObj.notify(); 		// 调用notify()方法，唤醒因为调用
										// wait()而挂起的线程
		}
		// 唤醒结束后，向控制台输出下一行文字。
		System.out.println(name + "：notify线程结束");
		System.out.println(name+"唤起线程结束");
	}
}
