package test;

import java.util.Enumeration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.TestFailure;
import junit.framework.TestResult;



public class Controlador {

//String perfil = "envio";	
String perfil = "recepcion";
//String perfil = "seguimiento";
	
	//@Test
	public void CLoginToEnvio() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		doctrack.LTSetDate();
	}

	public void CLoginToRecep() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		
	}
	
	@Test
	public void CPickUpSheet() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		doctrack.LTEnterCode();
		doctrack.LTPickCode();
	}
	
}
