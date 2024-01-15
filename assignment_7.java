package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// TODO Auto-generated method stub
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor Je  = (JavascriptExecutor)driver;
		Je.executeScript("window.scrollBy(0,600)");
	WebElement	products = driver.findElement(By.cssSelector("table[name = 'courses']"));
		
		System.out.println(products.findElements(By.tagName("tr")).size());
		System.out.println(products.findElements(By.tagName("th")).size());
		System.out.println(products.findElement(By.cssSelector("#product tr:nth-child(3)")).getText());


	}

}
