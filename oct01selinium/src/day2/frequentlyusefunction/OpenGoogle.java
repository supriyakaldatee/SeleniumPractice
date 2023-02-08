package day2.frequentlyusefunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.google.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getTitle().length());
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getCurrentUrl().length());
    System.out.println(driver.getPageSource().length());
    
	}

}
