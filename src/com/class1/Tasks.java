package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver//chromedriver.exe");
		ChromeDriver browser=new ChromeDriver();
		browser.get("https://www.amazon.com/");
		
		String actualTitle=browser.getTitle();
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		 if(expectedTitle.equals(actualTitle)) {
			 System.out.println("Titles match");
		 } else {
			 System.err.println("Titles do not match");
		 }
		 browser.close();
		
		
		
	}

}
