package com.class28;

public interface WebDriver {
	/*
	 * Create a WebDriver Interface that will have the following unimplemented 
	 * behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
	 *  Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
	 */

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome driver has open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome driver has close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome driver has  maximize window");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome driver has find element");
		}
	}

class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox driver has open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox driver has close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox driver has open maximize window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox driver has find element");
		
	}
	
}









