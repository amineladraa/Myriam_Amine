package fr.gtm.projetTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.projet.destination_mock.DAO.DestinationMockDao;
import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.voyage_mock.entities.Voyage;

public class VoyageMockDaoTest {


	@Test
	public void testCreer() {
		Voyage v1 = new Voyage();
		Voyage v2 = new Voyage();
		
		
		assertNull(v1.getId(),v1.getD(),v1.getF());
		assertNull(v2.getId(),v2.getD(),v2.getF());
		DestinationMockDao dao = new DestinationMockDao();
		dao.creer(d1);
		dao.creer(d3);
		dao.creer(d2);
		Long a = 1L , b=2L , c=3L;
		assertEquals(a,d1.getId());
		assertEquals(b,d3.getId());
		assertEquals(c,d2.getId());
	}

	@Test
	public void testSupprimer() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindVoyageById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindVoyageByClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindVoyagesbyVoyageur() {
		fail("Not yet implemented");
	}

}
