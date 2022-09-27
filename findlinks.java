package sep20assignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		int size=link.size();
		System.out.println(link.size());
		for (int i=0;i<link.size();i++)
		{
			WebElement a=link.get(i);
			String d=a.getText();
			System.out.println(d);
		}
driver.close();
	}

}
