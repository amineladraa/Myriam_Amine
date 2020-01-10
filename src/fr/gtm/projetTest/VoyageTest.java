package fr.gtm.projetTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;
import fr.gtm.projet.voyage_mock.entities.Voyage;
import fr.gtm.projet.voyage_mock.entities.Voyageur;

public class VoyageTest {

	@Test
	public void testGetVoyageurs() {
		Voyage v1 = new Voyage();
		Voyageur m1= new Voyageur("toto");
		Voyageur m2= new Voyageur ("titi");
		VoyageMockDao dao= new VoyageMockDao();
		dao.creer(v1);
		List<Voyageur> test = new ArrayList<>();
		test.add(m1);
		test.add(m2);
		v1.addVoyageur(test);
		assertEquals(2, v1.getVoyageurs().size());
		
		
	}


	@Test
	public void testAddVoyageur() {
		Voyage v1 = new Voyage();
		Voyageur m1= new Voyageur("toto");
		Voyageur m2= new Voyageur ("titi");
		VoyageMockDao dao= new VoyageMockDao();
		dao.creer(v1);
		List<Voyageur> test = new ArrayList<>();
		test.add(m1);
		test.add(m2);
		v1.addVoyageur(test);
		assertEquals(2, v1.getVoyageurs().size());
		test.add(m1);
		test.add(m2);
		test.add(m1);
		test.add(m2);
		test.add(m1);
		test.add(m2);
		test.add(m1);
		test.add(m2);
		v1.addVoyageur(test);
		assertEquals(2, v1.getVoyageurs().size());
	}

	@Test
	public void testGetVoyageMockDao() {
		Voyage v1 = new Voyage();
		assertNull(v1.getVoyageMockDao());
	}


	@Test
	public void testGetF() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetF() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetD() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetD() {
		fail("Not yet implemented");
	}

	@Test
	public void testVoyage() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRegion() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRegion() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDescriptif() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDescriptif() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrix() {
		fail("Not yet implemented");
	}

	@Test
	public void testCommander() {
		fail("Not yet implemented");
	}

}
