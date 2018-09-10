package test;

import org.apache.xalan.xsltc.compiler.Template;
import org.junit.Test;

import pageFactory.AbstractPageObject;

import pages.HomePage;
import pages.Login;
import pages.Recepcion;
import pages.Seguimiento;

public class LoginTest extends BaseTest {
	
	//CONSTRUCTOR
	
	public LoginTest() {
		super.setup();
		}	
	
	
//======================= LOGIN ==========================	
	
	public void LTLoginToDockTrack(String perfil) {
		Login login = new Login(driver, driverWait);	
		login.LoginToDocTrack(perfil);
	}
	
	
//======================= RECEPCIÓN ====================		
	
	public void LTEnterCode() {
		Recepcion recepcion = new Recepcion(driver, driverWait);
		recepcion.EnterDocCode();
	}
	
	public void LTPickCode() {
		Recepcion recepcion = new Recepcion(driver, driverWait);
		recepcion.PickCode();
	}
	
	
//======================= SEGUIMIENTO ====================	
	
	public void LTSetDate() {
		Seguimiento seg = new Seguimiento(driver, driverWait);
		seg.SetDate();
	}



	
	


}
