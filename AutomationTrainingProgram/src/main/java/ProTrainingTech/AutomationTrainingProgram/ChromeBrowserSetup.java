package ProTrainingTech.AutomationTrainingProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSetup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
	    Thread.sleep(6000);
	    File Webshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(Webshots, new File("C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\PicturesofWeb.jpg"));
		
		/*driver.navigate().forward();
		String windowhandleids=driver.getWindowHandle();
		System.out.println(windowhandleids);
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		//driver.close();*/
	}

}
