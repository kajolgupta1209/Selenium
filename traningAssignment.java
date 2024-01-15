package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class traningAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\kajol.gupta.SPERIDIAN\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		WebElement  dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select Options = new Select(dropDown);
		//Select objSelect = new Select();
		Options.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(5000);
		List <WebElement> items = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for (int i=0; i<items.size();i++)
		{
			items.get(i).click();
				


	}
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		}
	
	
}







