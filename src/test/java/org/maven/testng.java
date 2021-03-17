package org.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class testng {
@BeforeClass
public void BeforeClass() {
	System.out.println("BeforeClass");
}
@AfterClass
public void AfterClass() {
	System.out.println("AfterClass");
}@BeforeTest
public void BeforeMethod() {
	System.out.println("BeforeMethod");
}@AfterMethod
public void aftermethod() {
	System.out.println("@aftermethod");
}
}
