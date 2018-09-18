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
	

	public void CLoginToSeg() throws InterruptedException {
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

	@Test
	public void CReturnCreditStatusEmitido() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToConsultas();
		doctrack.LTCreditStatusEmitido();
	}

	@Test
	public void CReturnCreditStatusEnviado() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToConsultas();
		doctrack.LTCreditStatusEnviado();
	}

	@Test
	public void CReturnCreditStatusRecibido() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
		doctrack.LTGoToConsultas();
		doctrack.LTCreditStatusRecibido();
	}
	
}
