package org.maven;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=-1)
	public void tca() {
		System.out.println("tc1");
	}
	@Test(priority=-2)
	public void tcc() {
		System.out.println("tc3");
	}
	@Test
	public void tcd() {
		System.out.println("tc4");
	}
	@Test(priority=1)
	public void tcb() {
		System.out.println("tc2");
	}
}
