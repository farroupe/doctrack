package dt.DocTrack;


import org.junit.Test;

import test.Controller;

/**
 * Unit test for simple App.
 */
public class AppTest extends Controller{

	
// ENVIO ==============================================================================	
	
	@Test
	public void DTCheckEnvio() throws InterruptedException {
		Controller dt = new Controller();
		dt.CCheckPageEnvio();
	}
	

	
	
// RECEPCION =========================================================================	
	
	
	@Test
	public void DTCheckRecep() throws InterruptedException {
		Controller dt = new Controller();
		dt.CCheckPageRecep();
	}
	
	
	@Test
	public void DTPickSheet() throws InterruptedException {
		Controller dt = new Controller();
		dt.CPickUpSheet();
		
	}
	
// SEGUIMIENTO =======================================================================
	
	
	
	
	
	
	
	
}
