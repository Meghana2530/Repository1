package seleniumFull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Font {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "C:/Users/1021207/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To open file saved on local 
		driver.get("https://www.google.com");
		WebElement gmail= driver.findElement(By.linkText("Gmail"));
		String fontSize=gmail.getCssValue("font-size");
		String fontColor=gmail.getCssValue("color");
		System.out.println(fontSize);
		System.out.println(fontColor);
		driver.close();
		//style on browser 
		//git conflict
	}

}
