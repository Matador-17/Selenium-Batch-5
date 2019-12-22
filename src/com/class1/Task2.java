package com.class1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver//chromedriver.exe");
		ChromeDriver browser = new ChromeDriver();

		browser.get("https://www.amazon.com/");
		browser.navigate().to("https://www.google.com/");
		browser.navigate().back();
		browser.navigate().refresh();

		String currentUrl = browser.getCurrentUrl();
		String contains = "ama";

		if (currentUrl.contains(contains)) {
			System.out.println("URL contains " + contains);
		} else {
			System.err.println("URL does not contain syntax");
		}
		System.out.println(currentUrl);
		System.out.println();

		browser.close();

	}

}
