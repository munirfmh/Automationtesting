package ProTrainingTech.AutomationTrainingProgram;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class browser {

	private static FirefoxDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");

	EdgeDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");

		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		File Webshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(Webshots, new File("C:\\Users\\Owner\\eclipse-workspace\\SDET\\AutomationTrainingProgram\\PicturesofWeb.jpg"));
		
		
		

					
		
	}

}
