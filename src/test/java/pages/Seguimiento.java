package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class Seguimiento extends AbstractPageObject{

	public Seguimiento(WebDriver driver, WebDriverWait driverWait) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void SetDate() {
		
		WebElement dateSince = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde\"]"));
		WebElement dateUntil = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta\"]"));
		//WebElement dayPicked = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_table\"]/tbody/tr[1]/td[5]/div"));
		
		//Click en Fecha.
		dateSince.click();
		
		//Seleccionar mes.
		WebElement selectMonth = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_root\"]/div/div/div/div/div[2]/div/select[1]"));
			new Select(selectMonth).selectByVisibleText("Febrero");
		
		//Seleccionar día.	
		WebElement dayPkd = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_table\"]/tbody/tr[1]/td[5]/div"));
			dayPkd.click();
		
		
		WebElement btnClose = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/div[3]/button[2]"));

		
		btnClose.click();
		
		//	dayPicked.click();
		
	}
	
	
}
