package learning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver",
				"C:\\Users\\kajol.gupta.SPERIDIAN\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// TODO Auto-generated method stub
		driver.get("https://the-internet.herokuapp.com/");
		// driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

	}

}
