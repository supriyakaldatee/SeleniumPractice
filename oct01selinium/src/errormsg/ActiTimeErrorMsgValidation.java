package errormsg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeErrorMsgValidation {

	public static void main(String[] args) {
		//set required exe path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//crate an instance
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize browser
		driver.manage().window().maximize();
		//get url
		driver.get("https://demo.actitime.com/login.do");
		//click on login btn
		driver.findElement(By.id("loginButton")).click();
		//identifying error msg
		WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		//validation
		String errorColorInRGBA=errorMsg.getCssValue("color");
		String errorFontInRGBA=errorMsg.getCssValue("font-size");
		System.out.println(errorColorInRGBA);
		System.out.println(errorFontInRGBA);

	}

}
