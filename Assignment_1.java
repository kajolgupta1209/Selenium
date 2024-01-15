package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\Users\\kajol.gupta.SPERIDIAN\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//input[@minlength= '2']")).sendKeys("Kajol Gupta");
		driver.findElement(By.xpath("//input[@name= 'email']")).sendKeys("kajolgupta123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("K123456");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"] /option[2]")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("12-04-1990");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
