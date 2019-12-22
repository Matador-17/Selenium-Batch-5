package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//http-->hypertext transfer protocol
		driver.get("https://www.google.com");
		//browser navigation commands
		driver.navigate().to("https://amazon.com");
		//will navigate one site back
		driver.navigate().back();
		//will navigate one site forward
		driver.navigate().forward();
		driver.close();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		

	}

}
