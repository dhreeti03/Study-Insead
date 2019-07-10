package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myclass3 {
   // static WebElement element;
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://study-int.insead.edu/login";

		driver.get(baseUrl);
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.className("login--form"));
		login.click();
		Thread.sleep(2000);

		
		WebElement email = driver.findElement(By.cssSelector("input[type='text']"));
		email.sendKeys("dhreeti.shah@insead.edutest");
		Thread.sleep(1000); 

	/*	WebElement email1 = driver.findElement(By.cssSelector("input[type='text']"));
		email1.sendKeys("thilina.fonseka@insead.edutest");
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		pass.sendKeys("insead2018"); */

		
		WebElement pass1 = driver.findElement(By.cssSelector("input[type='password']"));
		pass1.sendKeys("insead2019");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Thread.sleep(6000);


 //  WebElement button =  driver.findElement(By.className("course_selection--list"));
  // button.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,1000)", "");
		
	WebElement scroll = driver.findElement(By.className("welcome--copy"));
	js.executeScript("arguments[0].scrollIntoView(true);",scroll);
	
	
	
	
	Thread.sleep(7000);
	
	driver.findElement(By.xpath("//a[@href='/app/2083/tasks']")).click();
	//driver.findElement(By.className("welcome--control")).click();
		//driver.findElement(By.id("ember432")).click();
		Thread.sleep(7000);
		System.out.println("Test complete");
		driver.close();

	}

}
