package loginwithcredential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) {
		//set required exe path
				System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
				//create an instance
				WebDriver driver=new ChromeDriver();
				//maximize
				driver.manage().window().maximize();
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//get url
				driver.get("https://demo.actitime.com/login.do");
				String[] username=driver.findElement(By.id("userCredentialsUsername")).getText().split(":");
				String[] password=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(4)>td")).getText().split(": ");
				driver.findElement(By.id("username")).sendKeys(username[1]);
				driver.findElement(By.name("pwd")).sendKeys(password[1]);
				driver.findElement(By.id("loginButton")).click();
	}

}
