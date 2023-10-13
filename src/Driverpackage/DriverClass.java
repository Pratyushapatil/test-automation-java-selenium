package Driverpackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DriverClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pratyusha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);  //explicit wait
		
		// String fashiontext=
		// driver.findElement(By.xpath("//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[2]/a/span[2]"));
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("snapdeal");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/ul/li[1]/div/div[2]/div[1]/div[1]/span"))
				.click();
		driver.findElement(By.xpath("//h3[text()='Shop Online for Men, Women & Kids Clothing ... - Snapdeal']"))
				.click();
		System.out.println(driver.getCurrentUrl() + "\n" + driver.getTitle() + "\n" + driver.getWindowHandle());
		// driver.findElement(By.id("identifier")).sendKeys("98pratyushapatil");
		// driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span")).click();
		Assert.assertEquals(
				driver.findElement(By.xpath("//span[@class='topHooks fastestDel lfloat fastestDelivery']")).getText(),
				"Brand Waali Quality, Bazaar Waali Deal!");

		Thread.sleep(5000);
		System.out.println("step 1 completed entering list");
		/*
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector("li[class='navlink'] a")); for(WebElement
		 * option :options) { if(option.getText().equals("Women's Fashion")) {
		 * option.click(); break; } }
		 */
		driver.findElement(By.xpath("//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[2]/a/span[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"//a[@href='https://www.snapdeal.com/products/women-apparel-sarees']/span[@class='linkTest' and contains(text(),'Sarees')]"))
				.click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath(
				"//a[@href='https://www.snapdeal.com/products/women-apparel-tees?sort=plrty']/span[@class='linkTest' and contains(text(),'T-Shirts')]"))
				.click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']")).sendKeys("411033");
		driver.findElement(By.xpath("//button[@class='pincode-check']")).click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		
		// driver.close();
		// driver.quit();

	}

}
