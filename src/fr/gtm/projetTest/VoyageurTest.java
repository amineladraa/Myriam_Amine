package fr.gtm.projetTest;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;
import fr.gtm.projet.voyage_mock.entities.Voyageur;

public class VoyageurTest {

	@Test
	public void testAddIdVoyage() {
		Voyageur m1 = new Voyageur("toto");
		m1.addIdVoyage(122L);
		Long a = 122L;
		assertEquals(a, m1.getIdVoyages().get(0));
	}

	

	@Test
	public void testSetCivilite() {
		Voyageur m1 = new Voyageur("toto");
		assertNull(m1.getCivilite());
		m1.setCivilite("Monsieur");
		assertEquals("Monsieur",m1.getCivilite());
	}

	@Test
	public void testSetNom() {
		Voyageur m1 = new Voyageur("toto");	
		m1.setNom("titi");
		assertEquals("titi",m1.getNom());

	}
	@Test
	public void testSetPrenom() {
		Voyageur m1 = new Voyageur("toto");	
		assertNull(m1.getPrenom());
		m1.setPrenom("titi");
		assertEquals("titi",m1.getPrenom());	}

	@Test
	public void testSetNumero() {
		Voyageur m1 = new Voyageur("toto");	
		assertNull(m1.getNumero());
		m1.setNumero("titi");
		assertEquals("titi",m1.getNumero());
	}

	@Test
	public void testSetId() {
		Voyageur m1 = new Voyageur("toto");
		VoyageMockDao dao = new VoyageMockDao();
		assertNull(m1.getId());
		dao.creer(m1);
		Long a=1L;
		assertEquals(a,m1.getId());
	}

	@Test
	public void testVoyageur() {
		Voyageur m1 = new Voyageur("toto");
		assertNotNull(m1);
	}

}
