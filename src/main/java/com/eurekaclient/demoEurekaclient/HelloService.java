package com.eurekaclient.demoEurekaclient;

public class HelloService {
	private int countmax;
	private int countmin;
	public HelloService(int countmax, int countmin) {
		super();
		this.countmax = countmax;
		this.countmin = countmin;
	}
	public int getCountmax() {
		return countmax;
	}
	public void setCountmax(int countmax) {
		this.countmax = countmax;
	}
	public int getCountmin() {
		return countmin;
	}
	public void setCountmin(int countmin) {
		this.countmin = countmin;
	}
	

}
