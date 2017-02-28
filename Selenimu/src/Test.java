import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
	{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/jaga/Downloads/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("DELL");
((WebElement) driver.findElements(By.xpath("//input[@value='Go']"))).click();
}
	}
