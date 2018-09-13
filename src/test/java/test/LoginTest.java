package test;

import org.apache.xalan.xsltc.compiler.Template;
import org.junit.Test;

import pageFactory.AbstractPageObject;
import pages.Envio;
import pages.HomePage;
import pages.Recepcion;
import pages.Seguimiento;

public class LoginTest extends BaseTest {
	
	//CONSTRUCTOR
	
	public LoginTest() {
		super.setup();
		}	
	


//======================= ENVIO ==========================		
	
	public void LTLoginToDTEnvio() {
		HomePage login = new HomePage(driver, driverWait);	
		login.LoginToDocTrack(USUARIO_ENVIO,PASS_ENVIO);
	}
	
	
	public void LTCheckPageEnvio() {
		Envio envio =  new Envio(driver, driverWait);
		envio.CheckPage();
	}
	
	
	public void LTPckUpDocSheet() {
		Envio envio = new Envio(driver, driverWait);
		envio.PickUpDocSheet();
	}
	
	
	
//======================= RECEPCIÓN ====================		
	
	public void LTLoginToDTRecep() {
		HomePage login = new HomePage(driver, driverWait);	
		login.LoginToDocTrack(USUARIO_RECEPCION,PASS_RECEPCION);
	}
	
	
	
	public void LTEnterCode() {
		Recepcion recepcion = new Recepcion(driver, driverWait);
		recepcion.EnterDocCode();
	}
	
	
	public void LTCheckPageRecep() {
		Recepcion recepcion = new Recepcion(driver, driverWait);
		recepcion.ChekPage();
	}
	
	
	public void LTPickCode() {
		Recepcion recepcion = new Recepcion(driver, driverWait);
		recepcion.PickCode();
	}
	
	
	public void LTCheckCredit() throws InterruptedException {
		Recepcion recepcion = new Recepcion(driver, driverWait);
		recepcion.CheckCredit();
	}
	
	
//======================= SEGUIMIENTO ====================	
	
	public void LTLoginToDTSeg() {
		HomePage login = new HomePage(driver, driverWait);	
		login.LoginToDocTrack(USUARIO_SEG,PASS_SEG);
	}

	
	


}
