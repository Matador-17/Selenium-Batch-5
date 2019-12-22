package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//http-->hypertext transfer protocol
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://amazon.com");
		//will navigate one site back
		driver.navigate().back();
		//will navigate one site forward
		driver.navigate().forward();
		driver.close();
		
		//.get you cannot go back or forward, won't store history
		//.navigate will store history allowing you to go back and forth
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		
	}

}
