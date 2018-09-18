package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pageFactory.AbstractPageObject;

public class Envio extends AbstractPageObject{

	public Envio(WebDriver driver, WebDriverWait driverWait) {
		super(driver, driverWait);
		// TODO Auto-generated constructor stub
    }

	
	public void CheckPage() {
		
		
		String titulo = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/h2")).getText();
		String subtitulo =  driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[1]/h5")).getText();
		String col1 = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/table/thead/tr/th[1]")).getText();
		String col2 = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/table/thead/tr/th[2]")).getText();
		String col3 = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/table/thead/tr/th[3]")).getText();
		String col4 = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/table/thead/tr/th[4]")).getText();
		String col5 = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/table/thead/tr/th[5]")).getText();
		String col6 = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/table/thead/tr/th[6]")).getText();
			
		
//		WebElement credPendBtn = driver.findElement(By.xpath("//*[@id='index-banner']/div/div[2]/a"));
		WebElement salirBtn = driver.findElement(By.tagName("a"));
		Boolean btnSalir= salirBtn.isDisplayed();
		
		
	//	driver.findElement(By.tagName("a")).getText();
		
		System.out.println(titulo);
		System.out.println(subtitulo);
		System.out.println(col1);
		System.out.println(col2);
		System.out.println(col3);
		System.out.println(col4);
		System.out.println(col5);
		System.out.println(col6);
		System.out.println(btnSalir);
		
		assertEquals("Carga de lote", titulo);
		assertEquals("Documentación a escanear", subtitulo);
		assertEquals("Crédito", col1);
		assertEquals("DNI", col2);
		assertEquals("Pagaré", col3);
		assertEquals("Condiciones de Frávega", col4);
		assertEquals("Condiciones de Sáenz", col5);
		assertEquals("Enviar incompleto info_outline", col6);
		
		
	}
	
	WebElement docTrackTable = driver.findElement(By.id("doctrack-js-tabla-documentacion-pendiente"));

	public void PickUpDocSheet() {
		// TODO Auto-generated method stub
		
	}
	
	
	/*	
	public void PickUpDocSheet() {
		List<WebElement> tds = docTrackTable.findElements(By.tagName("td"));
		
		System.out.println("lISTA DE ELEMENTOS"tds);
		
	
		for (Integer i=0;i<10;i++) {
		}
		
	//	WebElement credNum =  
		
	}
	*/
	
	
	
}
