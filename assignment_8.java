package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// TODO Auto-generated method stub
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.cssSelector("input[id = 'autocomplete']")).sendKeys("Ind");
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[id = 'autocomplete']")).sendKeys(Keys.DOWN);
driver.findElement(By.cssSelector("input[id = 'autocomplete']")).sendKeys(Keys.DOWN);
System.out.println(driver.findElement(By.cssSelector("input[id = 'autocomplete']")).getAttribute("value"));



	}

}
