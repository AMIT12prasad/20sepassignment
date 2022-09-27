package sep20assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Multiplesoflink {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			List<WebElement> links=driver.findElements(By.xpath("//a"));
			System.out.println(links.size());
			
			
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}
				

	}

}
