package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mobileRecharge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\Users\\kajol.gupta.SPERIDIAN\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myvi.in/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//ul/li/a[@id = 'navbarDropdown'])[1]"))).build().perform();
		
		//driver.findElement(By.xpath("(//ul/li/a[@id = 'navbarDropdown'])[1]")).click();
		//driver.get("https://www.myvi.in/prepaid/online-mobile-recharge");
		//driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9076307748");
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//input[@id='rechargeamount']")).sendKeys("10");
		//driver.findElement(By.xpath("//*[@id=\"cardAmountSearch\"]/div[1]/div/div[4]/div/button")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class ='servalidity_button']")).click();
		//Thread.sleep(12000);
		//driver.findElement(By.xpath("//input[@id= '1000071']")).sendKeys("6029221001891838");
		//driver.findElement(By.xpath("//input[@id = '1000072']")).sendKeys("12/28");
		//driver.findElement(By.xpath("//input[@id = '1000073']")).sendKeys("330");
		//driver.findElement(By.xpath("//*[@id=\"1000241\"]/article")).click();
        
    



	}

}
