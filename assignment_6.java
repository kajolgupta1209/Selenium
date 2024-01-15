package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id = 'checkBoxOption1']")).click();
		driver.findElement(By.xpath("(*//input[@class='right-align']/fieldset/label[1])")).click();
		String checkboxText = driver.findElement(By.id("checkBoxOption1")).getText();
		System.out.println(checkboxText);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sc = new Select(dropdown);
		sc.selectByVisibleText(checkboxText);
		driver.findElement(By.name("enter-name")).sendKeys(checkboxText);

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		if (text.contains(checkboxText))

		{

			System.out.println("Alert message success");

		}

		else

			System.out.println("Something wrong with execution");
		// driver.close();*/

	}

}
