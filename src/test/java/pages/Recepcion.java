package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class Recepcion extends AbstractPageObject{
	
	public Recepcion(WebDriver driver, WebDriverWait driverWait) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	String doc = "0223108968020101";

	
	public void EnterDocCode() {	
		WebElement docCode = driver.findElement(By.id("input-codigo-hoja"));
		docCode.sendKeys(doc);
	}
	
	public void PickCode() {
		WebElement bntSearch = driver.findElement(By.xpath("//*[@id=\"consultas\"]/div[1]/div[2]/button"));
		bntSearch.click();
	}
			
	
}
