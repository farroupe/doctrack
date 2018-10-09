package dt.DocTrack;

import org.junit.Test;

import test.Controller;
import test.LoginTest;

public class Seguimiento {
	
	@Test
	public void DTCheckSeg() throws InterruptedException {
		Controller dt = new Controller();
		dt.CCheckPageSeg();
	}
	
	@Test
	public void DTMakeReport() throws InterruptedException {
		Controller dt = new Controller();
		dt.CMakeReport();
	}
	
	@Test
	public void DTExecuteStatusCredEmitido() throws InterruptedException {
		Controller dt = new Controller();
		dt.CReturnCreditStatusEmitido();
	}
	
	@Test
	public void DTExecuteStatusCredEnviado() throws InterruptedException {
		Controller dt = new Controller();
		dt.CReturnCreditStatusEnviado();	
	}
	
	@Test
	public void DTExecuteStatusCredRecibido() throws InterruptedException {
		Controller dt = new Controller();
		dt.CReturnCreditStatusRecibido();
	}
	
	@Test
	public void DTExecuteReport() throws InterruptedException {
		Controller dt = new Controller();
		dt.CViewReport();
	}
	
	@Test
	public void DTConfigureReport() throws InterruptedException {
		Controller dt = new Controller();
		dt.CCofigureReport();
	}	
	
}
