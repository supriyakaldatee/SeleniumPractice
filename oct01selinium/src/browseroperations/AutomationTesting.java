package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the required url
		driver.get("https://demo.automationtesting.in/Register.html");
		//maximize browser window
		driver.manage().window().maximize();
		//set required size window
		driver.manage().window().setSize(new Dimension(400,600));
		//maximize browser window
		driver.manage().window().maximize();
		//go to next page
		driver.findElement(By.linkText("WebTable")).click();
		//go to back page
		driver.navigate().back();
		//to move next page
		driver.navigate().forward();
		//refresh the page
		driver.navigate().refresh();
		//to move different url
		driver.navigate().to("https://www.google.com");

	}

}
