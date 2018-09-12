package dt.DocTrack;


import org.junit.Test;

import test.Controlador;

/**
 * Unit test for simple App.
 */
public class AppTest extends Controlador{

	
// ENVIO ==============================================================================	
	

	public void DTCheckEnvio() {
		Controlador dt = new Controlador();
		dt.CCheckPageEnvio();
	}
	
	
	
// RECEPCION =========================================================================	
	
	
	@Test
	public void DTCheckRecep() {
		Controlador dt = new Controlador();
		dt.CCheckPageRecep();
	}
	
	
	@Test
	public void DTPickSheet() throws InterruptedException {
		Controlador dt = new Controlador();
		dt.CPickUpSheet();
		
	}
	
// SEGUIMIENTO =======================================================================
	
	
	
	
	
	
	
	
}
