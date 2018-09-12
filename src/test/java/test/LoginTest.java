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
	
	
//======================= LOGIN ==========================	
	
	public void LTLoginToDockTrack(String perfil) {
		HomePage login = new HomePage(driver, driverWait);	
		login.LoginToDocTrack(perfil);
	}

//======================= ENVIO ==========================		
	
	public void LTCheckPageEnvio() {
		Envio envio =  new Envio(driver, driverWait);
		envio.CheckPage();
	}
	
	
//======================= RECEPCIÓN ====================		
	
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
	
	//public void 
	
	
	public void LTSetDate() {
		Seguimiento seg = new Seguimiento(driver, driverWait);
		seg.SetDate();
	}



	
	


}
