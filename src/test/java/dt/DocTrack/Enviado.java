package dt.DocTrack;

import org.junit.Test;
import test.Controller;

public class Enviado {
	
	
//	@Test
	public void DTCheckEnvio() throws InterruptedException {
		Controller dt = new Controller();
		dt.CCheckPageEnvio();
	}
	
	@Test
	public void DTCloseLote() throws InterruptedException {
		Controller dt = new Controller();
		dt.CCloseLot();
	}
	

}
