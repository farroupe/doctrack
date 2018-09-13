package pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

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
	
	String credito = doc.substring(0,10);
	
	
	public void ChekPage() {
		String titulo = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/h2")).getText();
			
		WebElement salirBtn = driver.findElement(By.tagName("a"));
		Boolean btnSalir= salirBtn.isDisplayed();
		
		assertEquals("Recepción", titulo);
		assertTrue(btnSalir);
	}
	
	
	public void EnterDocCode() {	
		WebElement docCode = driver.findElement(By.id("input-codigo-hoja"));
		docCode.sendKeys(doc);
	}
	
	public void PickCode() {
		WebElement bntSearch = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[1]/form/div[2]/button"));
		bntSearch.click();
	}
	
	
	public void CheckCredit() throws InterruptedException {
		
		TimeUnit.SECONDS.sleep(2);
		
		WebElement wCredito = driver.findElement(By.xpath("//*[@id=\"placeholder-template-legajo\"]/div/div/div[1]/h4"));
			String creditoX = wCredito.getText();
		//	System.out.println(creditoX);
			
			String credPrefijo = creditoX.substring(8,11);
			String credSufijo = creditoX.substring(12,19);
			
		//	System.out.println("El número de crédito es: " + credito);
		//	System.out.println("Prefijo: "+ credPrefijo);
		//	System.out.println("Sufijo: " + credSufijo);
			
			String credCon = (credPrefijo+credSufijo);
		
		//	System.out.println(credCon);
			
			 assertEquals(credito, credCon);
			
			
			
			System.out.println("Este es el credito: "+credito);
			System.out.println("Este es el credito comparativos: "+credCon);
			
			GetOut();
	}
			
	

	
	
}
