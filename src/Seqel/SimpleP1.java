package Seqel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleP1 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//div[@class='customerNameDiv']//input[1]")).sendKeys("Biswa");
		driver.findElement(By.xpath("//div[@class='inputContainer']//textarea[1]")).sendKeys("fcycyfxrytg");

	}

}
