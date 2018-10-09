package test;



import org.junit.Test;


public class Controller {



//ENVIO ==============================================================================	

	
	public void CLoginToEnvio() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTEnvio();
	}

	public void CCheckPageEnvio() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTEnvio();
		doctrack.LTCheckPageEnvio();
	}
	
	@Test
	public void CCloseLot() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTEnvio();
		doctrack.LTPckUpDocSheet();
	}
	
	
	
	
// RECEPCION =========================================================================	
	
	
	public void CLoginToRecep() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTRecep();
		
	}	


	public void CCheckPageRecep() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTRecep();
		doctrack.LTCheckPageRecep();
	}
	
	
	public void CPickUpSheet() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTRecep();
		doctrack.LTEnterCode();
		doctrack.LTPickCode();
		doctrack.LTCheckCredit();
	}
	
	

// SEGUIMIENTO =======================================================================	
	

	public void CCheckPageSeg() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTCheckPageSeg();
	}

	
	public void CMakeReport() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTSetDateSince();
		doctrack.LTSetDateUntil();
		doctrack.LTExecuteReport();
	}

	
	public void CReturnCreditStatusEmitido() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToConsultas();
		doctrack.LTCreditStatusEmitido();
	}

	
	public void CReturnCreditStatusEnviado() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToConsultas();
		doctrack.LTCreditStatusEnviado();
	}

	
	public void CReturnCreditStatusRecibido() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToConsultas();
		doctrack.LTCreditStatusRecibido();
	}
	
	
	public void CViewReport( ) throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToReporte();
		doctrack.LTDownloadExcelReport();
		
	}
	
	
	public void CCofigureReport() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToReporte();
		doctrack.LTConfigureReport();
		
	}
	
	
}
