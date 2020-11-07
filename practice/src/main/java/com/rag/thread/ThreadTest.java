package com.rag.thread;


class Thread2 extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i +" "+Thread.currentThread().getId());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	}
}

class Thread1 implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i +" "+Thread.currentThread().getId());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 rt = new Thread1();
		Thread t1 = new Thread(rt);
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
		

	}

}
