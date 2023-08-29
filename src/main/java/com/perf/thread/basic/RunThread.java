package com.perf.thread.basic;

public class RunThread {
	public static void main(String[] args) throws InterruptedException {
		RunnableImpl ri = new RunnableImpl();
		ThreadExtends te = new ThreadExtends();

		new Thread(ri).start();
		System.out.println("thread 1초 멈춤 시작");
		Thread.sleep(1000);
		System.out.println("thread 1초 멈춤 끝");

		Thread currentThread = Thread.currentThread();
		synchronized(currentThread) {
			// System.out.println("main thread wait 시작 별다른 종료 시간을 주지 않으면 notify 될 때 까지 멈춰있는다.");
			// currentThread.wait();
			// Thread.sleep(1000);
			// System.out.println("main thread notify 호출 시작");
			// currentThread.notifyAll();
			// System.out.println("main thread notify 호출 끝");
			// System.out.println("main thread wait 종료");
			System.out.println("main thread wait 시작 1초 명시");
			currentThread.wait(1000);
			System.out.println("main thread wait 종료 시간을 명시하는 경우 notify를 하지 않아도 풀린다.");
		}

		System.out.println("join 시작 명시된 시간만큼 죽기를 기다린다? 대기한다");
		currentThread.join(1000);

		te.start();
	}
}
