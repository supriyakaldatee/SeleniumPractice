package propertyfileCalender;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PropertyDataInWebApp {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(".\\testdata\\AppDataProperties");
		Properties prop=new Properties();
		prop.load(file);
		
		//get property from AppdataProperties
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		String expectedTitle=prop.getProperty("expectedHomePageTitle");
		
		//set executable path using
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create an instance of required browser
		WebDriver driver=new ChromeDriver();
		//maximize browesr window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get required url
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle=driver.getTitle();		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Either login got failed or page title got changed");
	}
	}
}
