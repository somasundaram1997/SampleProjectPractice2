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
		
		WebElement txtUsername1 = driver.findElement(By.xpath("//input[@type='text']"));
		txtUsername.sendKeys("somasundaram@gamil.com");
		String text = txtUsername.getAttribute("value");
		System.out.println(text);
		
		WebElement txtPassword1 = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("123456789!");
		String text2 = txtPassword.getAttribute("value");
		System.out.println(text2);
		
		WebElement btn2 = driver.findElement(By.name("login"));
		btn2.click();

		
	}
}
