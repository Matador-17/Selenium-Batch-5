package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "drivers//chromedriver//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	//http-->hypertext transfer protocol
	driver.get("https://www.google.com");
	
	
	final String expectedTitle="Google";
	String actualTitle=driver.getTitle();
	
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("I'm on the right page");
	}else {
		System.err.println("The actual and expected Title did not match");
	}
	
	
	
	System.out.println("================");
	
	String actualUrl=driver.getCurrentUrl();
	System.out.println(actualUrl);
	
	String expectedUrl="https://www.google.com/";
	
	if(expectedUrl.equals(actualUrl)) {
		System.out.println("Both URL match");
	}else {
		System.err.println("Actual and Expected URL do not match");
	}
	
	
	
	driver.close();
	
	}

}
