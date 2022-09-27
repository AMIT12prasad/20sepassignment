package sep20assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoregisternewaccount {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.name("FirstName")).sendKeys("amit");
			driver.findElement(By.id("LastName")).sendKeys("kumar");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("akak@gmail.com");
		    driver.findElement(By.name("Password")).sendKeys("Amit@123");
		    driver.findElement(By.id("ConfirmPassword")).sendKeys("Amit@123");
		    driver.findElement(By.name("register-button")).click();
		   // driver.close();
	}

}
