package ProTrainingTech.AutomationTrainingProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class llocator {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.navigate().to("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.close();
			
		
		/*	WebElement searchit= driver.findElement(By.xpath("//input[@aria-label='search']"));	
			searchit.sendKeys("computer");
			
			WebElement searchicon= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
            searchicon.click();
            
            WebElement linkid=driver.findElement(By.xpath("//a[text()='Books']"));
            linkid.click();
            driver.close();*/
	
		}
			
		

	}


