package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		//set the required executable path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create an instance
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//maximize browser
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.flipkart.com");
		//to handle popup
		try {
			driver.findElement(By.cssSelector("div._2QfC02>button")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
       List<WebElement>flipList= driver.findElements(By.cssSelector("div#container>div>div:nth-of-type(2)>div>div>div>a"));
       System.out.println(flipList.size());
       for(int i=0;i<flipList.size();i++) {
    	   //problem
    	   flipList=driver.findElements(By.cssSelector("div#container>div>div:nth-of-type(2)>div>div>div>a"));
    	   System.out.println(flipList.get(i).getText());
       }
       for(int i=0;i<flipList.size();i++) {
    	   String flipName=flipList.get(i).getText();
    	   if(flipName.equals("Home")) {
    		   flipList.get(i).click();
    		   break;
    	   }
       }

}

	
}