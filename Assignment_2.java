package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\Users\\kajol.gupta.SPERIDIAN\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("Input[id='checkBoxOption1']")).isSelected());
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//Input[@name='checkBoxOption1']")).click();

		System.out.println(driver.findElement(By.xpath("//Input[@name='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//Input[@type='checkbox']")).size());
	}

}
