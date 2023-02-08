package errormsg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeErrorPositionValidation {

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
				//Explicti wait
				WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"), "Username or Password is invalid. Please try again."));
				//identifying error msg
				WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
				//identify username input field
				WebElement userNameInputField=driver.findElement(By.id("username"));
				//for error msg position validation,get error msg and username field x & y cords
				 Point errorPosition= errorMsg.getLocation();
				int error_X_Cord=errorPosition.getX();
				int error_Y_Cord=errorPosition.getY();
               System.out.println("erromsg X cord:"+error_X_Cord);
               System.out.println("erromsg Y cord:"+error_Y_Cord);
               //usernsme position
               Point usernamePosition=userNameInputField.getLocation();
				int username_X_Cord=usernamePosition.getX();
				int usename_Y_Cord=usernamePosition.getY();
              System.out.println("username X cord:"+username_X_Cord);
              System.out.println("username Y cord:"+usename_Y_Cord);
              System.out.println("Is error msg getting displayed above username input field: "+(error_Y_Cord< usename_Y_Cord));
	}

}
