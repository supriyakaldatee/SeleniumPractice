package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[]args) {
		//set required driver executable path using  System.setProperty(String key, String value)
		//using absolute path
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\workspace1\\oct01selinium\\drivers\\chromedriver.exe");
		//or using relative path
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//or using current working dir
		//String exePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", exePath);
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
	}
}
