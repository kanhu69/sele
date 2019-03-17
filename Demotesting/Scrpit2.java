package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrpit2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anew_software\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0");
		driver.manage().window().maximize();

	}

}
