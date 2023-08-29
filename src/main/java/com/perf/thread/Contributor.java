package com.perf.thread;

public class Contributor extends Thread{
	private Contribution myContribution;
	private String myName;

	public Contributor(Contribution contribution, String name){
		this.myContribution = contribution;
		this.myName = name;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++){
			myContribution.donate();
		}
		System.out.println(myName + " total = " + myContribution.getTotal());
	}
}
