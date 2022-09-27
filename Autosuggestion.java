package sep20assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("bcci.tv");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'bcci')]"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
		String listitems = list.get(i).getText();
		if(listitems.equalsIgnoreCase("bcci.tv ipl"))
		{
		System.out.println(listitems);
		list.get(i).click();
		break;
		
		

	}

		}}}
