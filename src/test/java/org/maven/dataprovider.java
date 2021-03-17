package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;

	@Test
	public void tc1() {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "sampledata")
	public void tc2(String email, String pass) {
		driver.get("https://www.facebook.com/");

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(pass);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@DataProvider(name="sampledata")
		public Object[][]data(){
			return new Object[][] {
				{"anu","test"},
                {"anbu","testing"},
                {"abi","test123"}	

			};
	}
}
