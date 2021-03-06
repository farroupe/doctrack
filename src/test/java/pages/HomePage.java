package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class HomePage extends AbstractPageObject {
	
	
	public HomePage(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
	 	// TODO Auto-generated constructor stub
	}

	WebElement usuName = driver.findElement(By.name("username"));
	WebElement usuPass = driver.findElement(By.id("doctrack-js-input-contraseña"));
	WebElement btn = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/form/div[3]/button"));
	
	
	public void LoginToDocTrack(String user, String pass) throws InterruptedException {
		usuName.sendKeys(user);
		usuPass.sendKeys(pass);
		btn.click();
		
		TimeUnit.SECONDS.sleep(2);
	}
	
	
	
/*	
	public void LoginToDocTrack(String perfil) {

		
		switch ( perfil ) {
		 
			case "envio":
				usuName.sendKeys("qa_envio");
				usuPass.sendKeys("123456");		 
				btn.click();
		           break;    
			 case "recepcion":
					usuName.sendKeys("qa_recep");
					usuPass.sendKeys("fravega18");		 
					btn.click();
		           break;
			 default:
					usuName.sendKeys("qa_seg");
					usuPass.sendKeys("fravega18");		 
					btn.click();
			break;
	 
		}	
	
	}
*/
	

	

	
	
}
