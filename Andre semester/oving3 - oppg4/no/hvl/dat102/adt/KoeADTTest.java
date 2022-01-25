package no.hvl.dat102.adt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

/**
 * Test for KoeADT
 * 
 * @author kjels
 */
public abstract class KoeADTTest {
	// Referanse til stabel
	private KoeADT<Integer> koe;
	
	// Testdata
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	
	protected abstract KoeADT<Integer> reset();
	
	/**
	 * Hent en ny k� for hver test.
	 * 
	 * @return
	 */
	@BeforeEach
	public void setup() {
		koe = reset();
	}

	/**
	 * Test p� at en ny k� er tom.
	 */
	@Test
	public void nyKoeErTom() {
		assertTrue(koe.erTom());
	}
	
	/**
	 * Test at det kan legges inn elementer og fjernes
	 */
	@Test
	public void innKoeUtKoe() {
		koe.innKoe(e0);
		koe.innKoe(e1);
		koe.innKoe(e2);
		koe.innKoe(e3);
		
		assertFalse(koe.erTom());
		
		try {
			assertEquals(e0, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e2, koe.utKoe());
			assertEquals(e3, koe.utKoe());
			
			assertTrue(koe.erTom());
		} catch (EmptyCollectionException e) {
			fail("pop feilet uventet " + e.getMessage());
		}
	}
	
	/**
	 * Tester at foreste() viser det f�rste elementet i k�en
	 */
	@Test
	public void foerste() {
		koe.innKoe(e0);
		koe.innKoe(e1);
		assertEquals(e0, koe.foerste());
	}
	
	/**
	 * Tester at det kastet unntak n�r man fjerner fra tom k�.
	 */
	@Test
	public void utFraTomKoe() {
		Assertions.assertThrows(EmptyCollectionException.class, () -> {
			koe.utKoe();
		});
	}
	
}