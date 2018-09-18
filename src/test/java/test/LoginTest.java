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
	
	public void LTLoginToDTEnvio() throws InterruptedException {
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
	
	public void LTLoginToDTRecep() throws InterruptedException {
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

	
	// EFECTIVIDAD | 
	
	public void LTLoginToDTSeg() throws InterruptedException {
		HomePage login = new HomePage(driver, driverWait);	
		login.LoginToDocTrack(USUARIO_SEG,PASS_SEG);
	}

	public void LTGoToConsultas() {
		Seguimiento seg =  new Seguimiento(driver, driverWait);
		seg.GoToConsultas();
	}
	
	
	public void LTCheckPageSeg() {
		Seguimiento seg = new Seguimiento(driver, driverWait);
		seg.CheckPage();
	}
	
	public void LTSetDateSince() throws InterruptedException {
		Seguimiento seg = new Seguimiento(driver, driverWait);
		seg.SetDateSince("Febrero", "2015");
	}
	
	public void LTSetDateUntil() throws InterruptedException {
		Seguimiento seg = new Seguimiento(driver, driverWait);
		seg.SetDateUntil("Septiembre", "2018");
	}
	
	public void LTExecuteReport() {
		Seguimiento seg = new Seguimiento(driver, driverWait);
		seg.ExecuteReport();
	}
	
	
	public void LTLookForACredit() {
		Seguimiento seg = new Seguimiento(driver, driverWait);
	//	seg.LookForACredit();
	}
	
	
	//	CONSULTA | ESTADO DE CREDITO =========================================
	
		public void LTCreditStatusEmitido() throws InterruptedException {
			Seguimiento seg = new Seguimiento(driver, driverWait);
			seg.CheckStatus("Emitido","0223111270"); // Número de Crédito Emitido
		}
	
	
		public void LTCreditStatusEnviado() throws InterruptedException {
			Seguimiento seg = new Seguimiento(driver, driverWait);
			seg.CheckStatus("Enviado", "0223109079"); // Número de Crédito Enviado
		}
		
	
		public void LTCreditStatusRecibido() throws InterruptedException {
			Seguimiento seg = new Seguimiento(driver, driverWait);
			seg.CheckStatus("Recibido","0223111288"); // Número de Crédito Recibido
		}
	
		
	//  REPORTE | 
		
	
}
