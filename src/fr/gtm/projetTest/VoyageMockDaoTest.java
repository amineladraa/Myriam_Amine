package fr.gtm.projetTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.security.ntlm.Client;

import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;
import fr.gtm.projet.voyage_mock.entities.Voyage;

public class VoyageMockDaoTest {


	@Test
	public void testCreerVoyage() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		
		assertNull(v1.getId());
		assertNull(v1.getF());
		assertNull(v1.getD());
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

//	@Test
//	public void testUpdateVoyage() {
//		Voyage v = new Voyage();
//		v.setD(d);
//		v.setF(f);
//		v.setVoyageurs(voyageurs);
//		
//	}

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
		
		
		
	}
//
//	@Test
//	public void testFindVoyagesbyVoyageur() {
//		fail("Not yet implemented");
//	}

}
