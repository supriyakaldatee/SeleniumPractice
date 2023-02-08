package loginwithcredential;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemo {

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
		driver.get("https://www.saucedemo.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		//identify username credential
		String[] usernames=driver.findElement(By.id("login_credentials")).getText().split("\n");
		//identify password credential
		String[] password=driver.findElement(By.cssSelector(".login_password")).getText().split("\n");
		for(int i=1;i<usernames.length;i++) {
			//identify username input field
			WebElement usernameInputfield=driver.findElement(By.id("user-name"));
			usernameInputfield.clear();
			usernameInputfield.sendKeys(usernames[i]);
			//identify password input field
			WebElement passwordInputfield=driver.findElement(By.id("password"));
			passwordInputfield.clear();
			passwordInputfield.sendKeys(password[1]);
		//identify login button
		driver.findElement(By.id("login-button")).click();
		if(driver.getCurrentUrl().contains("inventory")) {
			System.out.println("login successful for user:"+usernames[i]);
			wait.until(ExpectedConditions.urlContains("inventory"));
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
		}else {
			System.out.println("login failed for user:"+usernames[i]);
			usernameInputfield.clear();
			passwordInputfield.clear();
		}
		
		
		}
	}

}
