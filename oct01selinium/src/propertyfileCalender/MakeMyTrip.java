package propertyfileCalender;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakeMyTrip {

	public static void main(String[] args) {
		//set the executable path using
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		try{
			driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		//identify departure date
		driver.findElement(By.cssSelector("label[for='departure")).click();
		//select date
		driver.findElement(By.cssSelector("div.DayPicker>div>div:nth-of-type(2)>div:nth-of-type(2)>div:nth-of-type(3)>div:nth-of-type(2)>div:nth-of-type(2)>div>p")).click();

	}

}
