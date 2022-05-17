package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdownpractice {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createanaccount=driver.findElement(By.linkText("create new account"));
		createanaccount.click();
		Thread.sleep(6000);

				
		
		
		
	
	
	}

}
