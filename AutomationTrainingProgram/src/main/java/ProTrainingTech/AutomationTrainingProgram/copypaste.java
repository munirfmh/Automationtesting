package ProTrainingTech.AutomationTrainingProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;

public class copypaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS );
		
		WebElement searchto=driver.findElement(By.id("twotabsearchtextbox"));
		searchto.sendKeys("computer");
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		searchto.clear();
		searchto.click();
		Thread.sleep(6000);
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
