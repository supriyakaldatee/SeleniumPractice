package handingmutipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			//create an instance of required browser class
			WebDriver driver=new ChromeDriver();  //run time polymorphism
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//enter google application URL
			driver.get("http://www.amazon.in");
			//get all name
			List<WebElement> name=driver.findElements(By.cssSelector("header#navbar-main>div>div:nth-of-type(4)>div:nth-of-type(2)>div:nth-of-type(2)>div>a"));
           System.out.println(name.size());
           for(int i=0; i<name.size();i++) {
        	   if(!name.get(i).getText().isEmpty()) {
        	   System.out.println(name.get(i).getText());
           }else {
        	   System.out.println(name.get(i).getAttribute("innerHTML"));
        	   }
           }
           for(int i=0; i<name.size();i++) {
        	   String nameValue=name.get(i).getText();
        	   if(nameValue.equals("Amazon Pay")) {
        		   name.get(i).click();
        		   break;
        		   
        	   }
           }
	}

}
