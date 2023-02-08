package uicomponentvalidation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter the required url
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify firstname input field
		WebElement firstNameInputField=driver.findElement(By.className("form-control"));
		driver.findElement(By.className("form-control")).sendKeys("supriya");
		System.out.println("1st name input field visible or not?"+firstNameInputField.isDisplayed());
		System.out.println("1st name input field editable or not?"+firstNameInputField.isEnabled());
		String firstNameValue=firstNameInputField.getAttribute("placeholder");
		System.out.println(firstNameValue.equals("First Name"));
		//identify radio buttton
		WebElement maleRadioBtn=driver.findElement(By.name("radiooptions"));
		System.out.println("maleRadioBtn is visible or not?"+maleRadioBtn.isDisplayed());
		System.out.println("maleRadioBtn is editable or not?"+maleRadioBtn.isEnabled());
		System.out.println("maleRadioBtn is selected or not?"+maleRadioBtn.isSelected());
		maleRadioBtn.click();
		System.out.println("maleRadioBtn is selected or not?"+maleRadioBtn.isSelected());
		//identify submitt button
		WebElement submitBtn=driver.findElement(By.id("submitbtn"));
		System.out.println("submitBtn is visible or not?"+submitBtn.isDisplayed());
		System.out.println("submitBtn is clickable or not?"+submitBtn.isEnabled());
		String actualBtnName=submitBtn.getText().trim();
		System.out.println(actualBtnName.equals("Submit"));
		
	}

	
	}


