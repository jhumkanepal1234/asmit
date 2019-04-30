package com.class28;

public class TestWebDriver {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		
		WebDriver obj1=new FirefoxDriver();
		obj1.openBrowser();
		obj1.closeBrowser();
		obj1.maximizeWindow();
		obj1.findElement();
		

	}

}
