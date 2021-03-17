package org.maven;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class softasst {
	@Test
	public class hardasset {
		public void tc1() {
			System.out.println("1");
		}
		public void tc2() {
			System.out.println("2");
			//softassert
			Softassert s=new Softassert
			s.assertTrue(false);
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");

		}
		@Test
		public void tc3() {
			System.out.println("6");
		}

	}

}
