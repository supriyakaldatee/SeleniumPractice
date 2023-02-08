package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) {
		//set required executable path using
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of required browser
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get required url
		driver.get("https://www.redbus.in/");
        driver.findElement(By.id("src")).sendKeys("Swargate, Pune");
        driver.findElement(By.id("dest")).sendKeys("Mapusa, Goa");
        driver.findElement(By.id("onward_cal")).click();
        driver.findElement(By.cssSelector(".rb-monthTable>tbody>tr:nth-of-type(5)>td:nth-of-type(3)")).click();
        WebElement searchBtn=driver.findElement(By.cssSelector("#search>div>button"));
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search>div>button")));
        searchBtn.click();
	}

}
