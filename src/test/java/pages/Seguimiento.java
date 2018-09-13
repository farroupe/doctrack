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
	

	WebElement efectividadSolapa = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/ul/li[1]/a"));
	WebElement consultaSolapa = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/ul/li[2]/a"));
	WebElement reportesSolapa = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/ul/li[3]/a"));
	
	
	public void CheckPage() {
		
		
	}
		
		
	public void SetDate(String mes) {
		
		WebElement dateSince = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde\"]"));
		WebElement dateUntil = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta\"]"));
		//WebElement dayPicked = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_table\"]/tbody/tr[1]/td[5]/div"));
		
		//Click en Fecha.
		dateSince.click();
		
		//Seleccionar mes.
		WebElement selectMonth = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_root\"]/div/div/div/div/div[2]/div/select[1]"));
			new Select(selectMonth).selectByVisibleText(mes);
		
		//Seleccionar d�a.	
		WebElement dayPkd = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_table\"]/tbody/tr[1]/td[5]/div"));
			dayPkd.click();
		
		
		WebElement btnClose = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/div[3]/button[2]"));

		
		btnClose.click();
		
		//	dayPicked.click();
		
	}
	
	
}
