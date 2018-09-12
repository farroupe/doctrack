package test;



import org.junit.Test;


public class Controlador {

//String perfil = "envio";	
String perfil = "recepcion";
//String perfil = "seguimiento";


//ENVIO ==============================================================================	

	public void CLoginToEnvio() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
	}
	
	
	public void CCheckPageEnvio() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		doctrack.LTCheckPageEnvio();
	}
	
	
	
// RECEPCION =========================================================================	
	
	
	public void CLoginToRecep() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		
	}
	

	public void CCheckPageRecep() {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		doctrack.LTCheckPageRecep();
	}
	
	@Test
	public void CPickUpSheet() throws InterruptedException {
		LoginTest doctrack = new LoginTest();
		doctrack.LTLoginToDockTrack(perfil);
		doctrack.LTEnterCode();
		doctrack.LTPickCode();
		doctrack.LTCheckCredit();
	}
	
	

// SEGUIMIENTO =======================================================================	
	
	
	public void CLoginToSeg() {
		LoginTest doctrack = new LoginTest();

	}




}
