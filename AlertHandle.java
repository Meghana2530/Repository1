package seleniumFull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {
//testing git
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "C:/Users/1021207/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		//To open file saved on local 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.javascriptkit.com/javatutors/alert2.shtml");
		WebElement alertbutton= driver.findElement(By.xpath("//input[@name='B2']"));
		alertbutton.click();
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();		
		alt.accept();		
		driver.close();
		
	}

}
