package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		
		WebElement departure=driver.findElement(By.xpath("May 10, 2022 selected, current check in date."));
		
		
		

	}

}
