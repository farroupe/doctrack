package test;



import org.junit.Test;


public class Controller {



//ENVIO ==============================================================================	

	@Test
	public void CLoginToEnvio() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTEnvio();
	}
	
	
	public void CCheckPageEnvio() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTEnvio();
		doctrack.LTCheckPageEnvio();
	}
	
	public void CloseLot() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTEnvio();
		doctrack.LTPckUpDocSheet();
	}
	
	
// RECEPCION =========================================================================	
	
	
	public void CLoginToRecep() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTRecep();
		
	}	

	public void CCheckPageRecep() {
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
	
	
	public void CLoginToSeg() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDTSeg();
	}




}
