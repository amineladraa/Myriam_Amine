package fr.gtm.projetTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
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
	public void testGetFormule() {
		Voyage v1 = new Voyage();
		Formule f1 = new Formule();
		assertNull(v1.getFormule());
		v1.setFormule(f1);
		assertEquals(f1,v1.getFormule());
		
	}

	@Test
	public void testSetFormule() {
		Voyage v1 = new Voyage();
		Formule f1 = new Formule();
		assertNull(v1.getFormule());
		v1.setFormule(f1);
		assertEquals(f1,v1.getFormule());
	}

	

	@Test
	public void testSetDestination() {
		Voyage v1 = new Voyage();
		Destination d1 = new Destination("Lyon");
		assertNull(v1.getDestination());
		v1.setDestination(d1);
		assertEquals(d1,v1.getDestination());
	}

	@Test
	public void testVoyage() {
	
		Voyage v1 = new Voyage();
		assertNotNull(v1);
	}



	@Test
	public void testGetId() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		VoyageMockDao dao= new VoyageMockDao();
		dao.creer(v1);
		dao.creer(v2);
		Long a=1L, b=2L;
		assertEquals(b,v2.getId());
	}

	@Test
	public void testSetId() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		VoyageMockDao dao= new VoyageMockDao();
		dao.creer(v1);
		dao.creer(v2);
		Long a=1L, b=2L;
		v2.setId(a);
		assertEquals(a,v2.getId());
	}

	@Test
	public void testGetPrix() {
		Voyage v1 = new Voyage();
		Formule f1= new Formule();
		Voyageur m1 = new Voyageur("toto");
		Voyageur m2 = new Voyageur("tata");
		List<Voyageur> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		v1.addVoyageur(list);
		v1.setFormule(f1);
		f1.setPrix(111.0);
		assertEquals(222.0,v1.getPrix(),0.1);


}

	@Test
	public void testAttribuerIdVoyage() {
		Voyage v1 = new Voyage();
		Voyageur m1 = new Voyageur("toto");
		Voyageur m2= new Voyageur("");
		List<Voyageur> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		VoyageMockDao dao= new VoyageMockDao();
		dao.creer(v1);
		dao.creer(m1);
		dao.creer(m2);
		v1.addVoyageur(list);
		v1.attribuerIdVoyage(v1.getVoyageurs());
		assertEquals(v1.getId(),m1.getIdVoyages().get(0));
		assertEquals(v1.getId(),v1.getVoyageurs().get(0).getIdVoyages().get(0));
	}

}
