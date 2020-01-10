package fr.gtm.projetTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;
import fr.gtm.projet.voyage_mock.entities.Client;
import fr.gtm.projet.voyage_mock.entities.Voyage;
import fr.gtm.projet.voyage_mock.entities.Voyageur;

public class VoyageMockDaoTest {


	@Test
	public void testCreerVoyage() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		
		assertNull(v1.getId());
		assertNull(v1.getFormule());
		assertNull(v1.getDestination());
		VoyageMockDao dao = new VoyageMockDao();
		dao.creer(v1);
		dao.creer(v2);
		Long a = 1L , b=2L;
		assertEquals(a,v1.getId());
		assertEquals(b,v2.getId());
	}

	@Test
	public void testSupprimerVoyage() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		VoyageMockDao dao = new VoyageMockDao();
		dao.creer(v1);
		dao.creer(v2);
		Long a = 1L, b=2L;
		assertEquals(a,v1.getId());
		assertEquals(b,v2.getId());
		dao.supprimer(v1);
		assertNull(v1.getId());
		assertEquals(b,v2.getId());
	}
	
	@Test
	public void testSupprimerVoyageur() {
		Voyageur v1 = new Voyageur("toto");
		Voyageur v2 = new Voyageur("titi");
		VoyageMockDao dao = new VoyageMockDao();
		dao.creer(v1);
		dao.creer(v2);
		Long a = 1L, b=2L;
		assertEquals(a,v1.getId());
		assertEquals(b,v2.getId());
		dao.supprimer(v1);
		assertNull(v1.getId());
		assertEquals(b,v2.getId());
	}
	

	@Test
	public void testUpdateVoyage() {
		Voyage v1 = new Voyage();
		VoyageMockDao dao= new VoyageMockDao();
		Formule f= new Formule();
		Destination d = new Destination("Lyon");
		v1.setDestination(d);
		v1.setFormule(f);		
		List<Voyageur> voyageurs= new ArrayList <>();
		Voyageur m1= new Voyageur("toto");
		Voyageur m2 = new Voyageur("titi");
		voyageurs.add(m1);
		voyageurs.add(m2);
		dao.update(v1, d,f,voyageurs);
		assertEquals(d, v1.getDestination());
	
	}

	@Test
	public void testFindVoyageById() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		VoyageMockDao dao= new VoyageMockDao();
		dao.creer(v1);
		dao.creer(v2);
		Long a = 1L, b=3L;
		assertEquals(v1,dao.findVoyageById(a));
		assertNull(dao.findVoyageById(b));
	}

	@Test
	public void testFindVoyageByClient() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		VoyageMockDao dao = new VoyageMockDao();
		Client c1 = new Client("toto","0605421450");
		c1.addVoyage(v1);
		c1.addVoyage(v2);
		assertEquals(2,dao.findVoyageByClient(c1).size());
	
	}

	@Test
	public void testFindVoyagesbyVoyageur() {
		Voyageur v1 = new Voyageur("Gaston");
		v1.addIdVoyage(1L);
		v1.addIdVoyage(2L);
		v1.addIdVoyage(3L);
		VoyageMockDao dao = new VoyageMockDao();
		dao.creer(v1);
		assertEquals(3,dao.findVoyagesbyVoyageur(v1).size());
		
	}

}
