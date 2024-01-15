package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\kajol.gupta.SPERIDIAN\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// TODO Auto-generated method stub
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");
		//driver.switchTo().frame(0);
		//System.out.println(driver.findElement(By.xpath("//frame[@name = 'frame-middle']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());

	}

}
