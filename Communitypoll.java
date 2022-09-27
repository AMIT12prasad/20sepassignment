package sep20assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Communitypoll {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.id("pollanswers-2")).click();
			driver.findElement(By.xpath("//*[@id=\"vote-poll-1\"]")).click();
	}

}
