package sep20assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropedownlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/AMIT%20P/Desktop/web%20tech%20class/dropedownlist.html");
		WebElement listbox=driver.findElement(By.xpath("/html/body/select"));
		
		Select sel=new Select(listbox);
		//sel.selectByVisibleText("GLORINA");
		//sel.selectByValue("G");
		sel.selectByIndex(5);
		
	
	}

}
