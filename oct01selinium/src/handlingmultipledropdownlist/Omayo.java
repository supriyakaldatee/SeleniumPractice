package handlingmultipledropdownlist;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Omayo {

	public static void main(String[] args) {
		//set required executable path using
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create an instance of chrome driver
		WebDriver driver=new ChromeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get required url 
		driver.get("http://omayo.blogspot.com/");
        
		//**** Idetify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		//**** Create an instance of Select class and pass above element into its constructor
		Select carOption=new Select(carDropdown);
		
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+carOption.isMultiple());
		
		//get option of dropdown list
		List<WebElement>option= carOption.getOptions();
		System.out.println("option count is:"+option.size());
		
		//print option name
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());
	}
		//select option from list
		carOption.selectByIndex(2);
		carOption.selectByIndex(3);
		carOption.selectByVisibleText("Volvo");
		
		//print selected option
		List<WebElement> selectCars=carOption.getAllSelectedOptions();
		System.out.println("print selected cars:"+selectCars.size());
		for(int i=0;i<selectCars.size();i++) {
			System.out.println(selectCars.get(i).getText());
		}
		//deselect selected option
		carOption.deselectByIndex(2);
		
		
		
		}
		
	}


