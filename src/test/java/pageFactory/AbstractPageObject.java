package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageObject {

	protected WebDriver driver;
	protected WebDriverWait driverWait;
	
	//Constructores del WebDriver
	public AbstractPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AbstractPageObject(WebDriver driver, WebDriverWait driverWait) {
		this.driver = driver;
		this.driverWait = driverWait;
		PageFactory.initElements(driver, this);
	} 
	
	
	public void GetOut() {
		WebElement salir = driver.findElement(By.xpath("/html/body/nav/div/ul/li/a"));
			salir.click();
	}


}
