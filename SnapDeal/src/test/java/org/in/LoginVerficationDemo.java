package org.in;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginVerficationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		
		WebElement sigin= driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		sigin.click();
		
	WebElement register=driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	register.click();
	
    driver.switchTo().frame("loginIframe");
	WebElement emailid=driver.findElement(By.id("userName"));
	emailid.sendKeys("mithal234@gmail.com");
	
	WebElement continune= driver.findElement(By.id("checkUser"));
	continune.click();
	
	
	WebElement phone= driver.findElement(By.id("j_number"));
	phone.sendKeys("8148533156");
	
	WebElement name=driver.findElement(By.name("j_name"));
	name.sendKeys("bala");
	
	WebElement dob=driver.findElement(By.name("j_dob"));
	dob.sendKeys("26/02/1998");
	
	WebElement pass=driver.findElement(By.id("j_password"));
	pass.sendKeys("Rajkumar2@");
	
	WebElement button=driver.findElement(By.id("userSignup"));
	button.click();
	WebElement string=driver.findElement(By.xpath("//*[@id=\"login-register-modal\"]/div/div[10]/div[2]/p"));
	if (string.equals(string)) {
		System.out.println("Enter valid otp");
		
	} else {
		System.out.println("Not enter the valid otp");

	}
	}

}
