package handingmutipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggesstion {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			//create an instance of required browser class
			WebDriver driver=new ChromeDriver();  //run time polymorphism
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//enter google application URL
			driver.get("http://www.google.com");
			//search SQL in google
			driver.findElement(By.name("q")).sendKeys("SQL");
			//get all suggesstion list from google search page
			List<WebElement>suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
			System.out.println(suggList.size());
			//print one by one all suggesstion
			for(int i=0; i<suggList.size();i++) {
				//WebElement element=suggList.get(i);
				//System.out.println(element.getText());
				//or
				System.out.println(suggList.get(i).getText());
				//click on sql full form suggestion
				String suggName=suggList.get(i).getText();
				if(suggName.equals("sql full form")) {
				suggList.get(i).click();
				break;
			}

	}

	}
}
