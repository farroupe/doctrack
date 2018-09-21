package pages;

import static org.junit.Assert.assertEquals;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import pageFactory.AbstractPageObject;

public class Seguimiento extends AbstractPageObject{

	public Seguimiento(WebDriver driver, WebDriverWait driverWait) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	WebElement efectividadSolapa = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/ul/li[1]/a"));
	WebElement consultaSolapa = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/ul/li[2]/a"));
	WebElement reportesSolapa = driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div[1]/ul/li[3]/a"));
	WebElement buscBtn =  driver.findElement(By.xpath("//*[@id=\"efectividad\"]/div[1]/div/div[3]/button"));
	
	
	
	
	public void GoToConsultas() {
		consultaSolapa.click();
	}
	
	public void GoToReporte( ) {
		reportesSolapa.click();
	}
	
	
	public void CheckPage() {
		String efec = efectividadSolapa.getText();
		String cons = consultaSolapa.getText();
		String report = reportesSolapa.getText();
		
		assertEquals("EFECTIVIDAD", efec);
		assertEquals("CONSULTAS", cons);
		assertEquals("REPORTE", report);
		
		buscBtn.isEnabled();
	}
			
	public void SetDateSince(String mesSince, String anioSince) throws InterruptedException {
		
		WebElement dateSince = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde\"]"));
			dateSince.click();

		//Seleccionar mes.
		WebElement selectMonth = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_root\"]/div/div/div/div/div[2]/div/select[1]"));
			new Select(selectMonth).selectByVisibleText(mesSince);
		
		//Seleccionar Año
		WebElement selectYear = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_root\"]/div/div/div/div/div[2]/div/select[2]"));
			new Select(selectYear).selectByVisibleText(anioSince);
				
			TimeUnit.SECONDS.sleep(2);
			
		//Seleccionar dia.	
		WebElement dayPkd = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-desde_table\"]/tbody/tr[1]/td[5]/div"));
			dayPkd.click();
	
		//Botón Cerrar
		WebElement btnClose = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/div[3]/button[2]"));
			btnClose.click();
	}
	
	
	public void SetDateUntil(String mesUntil, String anioUntil) throws InterruptedException {
		
		WebElement dateUntil = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta\"]"));
			dateUntil.click();
			
			//Seleccionar mes.
			WebElement selectMonth = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta_root\"]/div/div/div/div/div[2]/div/select[1]"));
				new Select(selectMonth).selectByVisibleText(mesUntil);
				
			//Seleccionar Año
			WebElement selectYear = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta_root\"]/div/div/div/div/div[2]/div/select[2]"));
				new Select(selectYear).selectByVisibleText(anioUntil);			
	
				TimeUnit.SECONDS.sleep(2);
				
			WebElement dayPkd = driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta_root\"]/div/div/div/div/div[3]/button[1]"));
				dayPkd.click();
							
			WebElement btnClose =  driver.findElement(By.xpath("//*[@id=\"filtro-fecha-hasta_root\"]/div/div/div/div/div[3]/button[2]"));
				btnClose.click();
				
	}
	
	public void ExecuteReport() {
		WebElement btnExec = driver.findElement(By.xpath("//*[@id=\"efectividad\"]/div[1]/div/div[3]/button"));
			btnExec.click();	
	}
	
	public void LookForACredit(String creditNum) {
		WebElement credField = driver.findElement(By.id("busqueda-credito"));
		WebElement btnCredStatus = driver.findElement(By.xpath("//*[@id=\"consultas\"]/div[1]/div[2]/button"));
			credField.sendKeys(creditNum);
			btnCredStatus.click();	
	}
	
	
	public void CheckStatus(String estadoCred, String creditNum) throws InterruptedException {
		
		
		LookForACredit(creditNum);
		
		
		System.out.println("estado Credito: " + estadoCred);
		
		TimeUnit.SECONDS.sleep(2);
		
			WebElement divEmitido = driver.findElement(By.xpath("//*[@id=\"doctrack-js-detalle-credito\"]/div[1]/div/ol/li[1]/div"));
				String bkgColorEmit = divEmitido.getCssValue("background-color");
				System.out.println("Color de Emitido OK: "+bkgColorEmit);
				
			WebElement divEnviado = driver.findElement(By.xpath("//*[@id=\"doctrack-js-detalle-credito\"]/div[1]/div/ol/li[2]/div"));
				String bkgColorEnv = divEnviado.getCssValue("background-color");
				System.out.println("Color de Enviado OK: "+bkgColorEnv);	
			
			WebElement divRecibido = driver.findElement(By.xpath("//*[@id=\"doctrack-js-detalle-credito\"]/div[1]/div/ol/li[3]/div"));
				String bkgColorRec = divRecibido.getCssValue("background-color");
				System.out.println("Color de Recibido OK: "+bkgColorRec);
							
				
		switch (estadoCred) {
			case "Emitido":
				System.out.println("CASO EMITIDO");
				assertEquals("rgba(57, 73, 171, 1)", bkgColorEmit);
				assertEquals("rgba(224, 224, 224, 1)", bkgColorEnv);
				assertEquals("rgba(224, 224, 224, 1)", bkgColorRec);
				break;  
			case "Enviado":
				System.out.println("CASO ENVIADO");
				assertEquals("rgba(57, 73, 171, 1)", bkgColorEmit);	// rgba(57, 73, 171, 1)|AZUL
				assertEquals("rgba(57, 73, 171, 1)", bkgColorEnv);	// AZUL	
				assertEquals("rgba(224, 224, 224, 1)", bkgColorRec);	// rgba(57, 73, 171, 1)| GRIS
				break;  
			default:
				System.out.println("CASO RECIBIDO");
				assertEquals("rgba(57, 73, 171, 1)", bkgColorEmit);	// rgba(57, 73, 171, 1)|AZUL
				assertEquals("rgba(57, 73, 171, 1)", bkgColorEnv);
				assertEquals("rgba(57, 73, 171, 1)", bkgColorRec);
				break;  
		}
				

	}
	
	
	WebElement selectTipoFecha = driver.findElement(By.xpath("//*[@id='reporte']/div/div/div[1]/div[1]/div/select"));

	WebElement cantEnvio = driver.findElement(By.xpath("//*[@id=\"reporte\"]/div/div/div[1]/div[6]/div/select"));
	WebElement cantRecep = driver.findElement(By.xpath("//*[@id=\"reporte\"]/div/div/div[1]/div[7]/div/select"));

	
	public void DownloadReport() {
		WebElement btnDownload = driver.findElement(By.xpath("//*[@id=\"reporte\"]/div/div/div[2]/button"));
			btnDownload.click();
	}
	
	
	public void ConfigureReporte() {
	//	WebElement selectTipoFecha = driver.findElement(By.id("select-options-7ab072fa-816b-5e96-861e-c7cb365280f7"));
		
		//	Tipo de Fecha
		WebElement selectTipoFecha = driver.findElement(By.xpath("//*[@id=\"reporte\"]/div/div/div[1]/div[1]/div/select"));

		WebElement cantEnvio = driver.findElement(By.xpath("//*[@id=\"reporte\"]/div/div/div[1]/div[6]/div/input"));
		WebElement cantRecep = driver.findElement(By.xpath("//*[@id=\"reporte\"]/div/div/div[1]/div[7]/div/select"));
		
			new Select(selectTipoFecha).selectByValue("Fecha envio");
		
			WebElement filtroSuc = driver.findElement(By.id("filtro-numero-sucursal"));
			WebElement filtroCredNum = driver.findElement(By.id("filtro-numero-credito"));
				
			new Select(cantEnvio).selectByVisibleText("Todos");
			new Select(cantRecep).selectByVisibleText("Todos");
			
			DownloadReport();
	}
	
	
	
}
