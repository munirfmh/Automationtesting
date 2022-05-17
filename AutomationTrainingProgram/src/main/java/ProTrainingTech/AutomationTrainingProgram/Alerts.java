package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement simpleof=driver.findElement(By.name("alert"));
		simpleof.click();
		driver.switchTo().alert().accept();
	    Thread.sleep(6000);	
	    WebElement ConfirmationofAlert=driver.findElement(By.name("confirmation"));
	    ConfirmationofAlert.click();
	    Thread.sleep(6000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(6000);
	    ConfirmationofAlert.click();
	    Thread.sleep(6000);
	    driver.switchTo().alert().dismiss();
	    WebElement promptofAlert=driver.findElement(By.name("prompt"));
	    promptofAlert.clear();
	    driver.switchTo().alert().sendKeys("Accept");
	    driver.switchTo().alert().accept();
	    
	    
	    
	    

	}

}
