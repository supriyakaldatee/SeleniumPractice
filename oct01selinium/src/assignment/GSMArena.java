package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GSMArena {

	private static final Function ExpectedConditions = null;

	public static void main(String[] args) {
		//set the required executable path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
       //create an instance
		WebDriver driver=new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();                     
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get url
		driver.get("https://www.gsmarena.com");
		List<WebElement> gsmArenaList=driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li"));
		System.out.println(gsmArenaList.size());
		for(int i=0;i<gsmArenaList.size();i++) {
			System.out.println(gsmArenaList.get(i).getText());
		}
		for(int i=0;i<gsmArenaList.size();i++) {
			System.out.println(gsmArenaList.get(i).getText().equals("SUMSUNG"));
			gsmArenaList.get(i).click();
			break;
		}
		List<WebElement> sumsungList=driver.findElements(By.cssSelector("div.section-body>div>ul>li>a>strong>span"));
		System.out.println(sumsungList.size());
		//WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement click=driver.findElement(By.cssSelector("div.review-nav>div:nth-of-type(2)>a.pages-next"));
		for(int i=0;i<sumsungList.size();i++) {
			if(click.isEnabled()) {
			System.out.println(click);
			System.out.println(sumsungList.get(i).getText());
			}else {
				System.out.println("list is complete here");
			}	
    }
  }
}