package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		// TODO Auto-generated method stub
		driver.get("https://www.axisbank.com/");
		System.out.println("Total Number of Links Count = " + driver.findElements(By.tagName("a")).size());

	}

}
