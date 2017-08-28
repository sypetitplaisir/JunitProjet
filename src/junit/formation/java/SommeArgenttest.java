package junit.formation.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.formationJava.SommeArgent;
import junit.formationJava.SommeTresGrandeException;

public class SommeArgenttest {

	private SommeArgent monCompte;
	
	//@Rule
	//public final ExpectedException exception = ExpectedException.none();
	
	@Before
	public void executeBefore() {
		System.out.println("executeBefore");
		monCompte= new SommeArgent();
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void Versertest() {
		//SommeArgent monCompte= new SommeArgent();
		assertNotNull(monCompte);
		System.out.println("Versertest TEST OK");
	}
	
	@Test(expected = SommeTresGrandeException.class)
	public void Retirertest() throws SommeTresGrandeException{
		
		//exception.expect(SommeTresGrandeException.class);
		
		assertEquals(100, monCompte.Retirer(100, 2000));
		//monCompte.Retirer(15, 5000);
		
		//SommeArgent monCompte= new SommeArgent();
		
		/*
		try {
			assertEquals(1001, monCompte.Retirer(1001, 2000));
		} catch (SommeTresGrandeException e) {
			// TODO Auto-generated catch block
			
			System.out.println("SommeTresGrandeException");
		}
		*/
		
		System.out.println("Retirertest TEST OK");
	}
	
}
