package dt.DocTrack;

import org.junit.Test;

import test.Controller;

public class Recepcion {
	
	
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
	

}
