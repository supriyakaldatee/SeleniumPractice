package day1.browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\JAVA\\workspace1\\oct01selinium\\drivers\\geckodriver.exe");
     //Create an instance of required browser class
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}
