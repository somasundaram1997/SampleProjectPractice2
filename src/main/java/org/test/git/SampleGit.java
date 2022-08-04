package org.test.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleGit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("sunadarm");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("989898");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		WebElement txtUser2 = driver.findElement(By.id("email"));
		txtUsername.sendKeys("sunadarm");
		
		WebElement txtPass2 = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("989898");
		
		WebElement btn2 = driver.findElement(By.name("login"));
		btnLogin.click();

		
	}
}
