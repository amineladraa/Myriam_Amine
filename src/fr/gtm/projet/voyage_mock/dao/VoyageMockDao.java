package fr.gtm.projet.voyage_mock.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.entities.Client;
	import fr.gtm.projet.voyage_mock.entities.Voyage;
import fr.gtm.projet.voyage_mock.entities.Voyageur;

	public class VoyageMockDao implements VoyageDao {

	private static Long id=0L;
	List<Voyage> voyages = new ArrayList<Voyage>();
	List<Voyageur> voyageurs = new ArrayList<Voyageur>();
	List<Client>clients =new ArrayList<Client>();
	/**
	 * id est la variable qui permet la gestion des identifiants BDD sans redondance à partir de 1 
	 * Le constructeur permet de réinitialiser à 0 la variable id 
	 * 
	 * Cela permet de ne pas provoquer des problemes sur JUnit
	 */
	public VoyageMockDao() {
		id=0L;
	}

	/**
	 * Méthode qui permet de creer le Voyage sur la BDD VoyageMock et non de creer l'objet
	 */
	@Override
	public void creer(Voyage v) {
	v.setId(++id);
	voyages.add(v);
	}
	
	/**
	 * Méthode qui permet de creer le Client sur la BDD VoyageMock et non de creer l'objet
	 */
	@Override
	public void creer(Client c) {
	c.setId(++id);
	clients.add(c);
	}
	
	/**
	 * Méthode qui permet de creer le Voyageur sur la BDD VoyageMock et non de creer l'objet
	 */
	@Override
	public void creer(Voyageur v1) {
	v1.setId(++id);
	voyageurs.add(v1);
	}

	@Override
	public void supprimer(Voyage v) {
	voyages.remove(voyages.indexOf(v));
	v.setId(null);
	}

	@Override
	public void update (Voyage v, Destination d, Formule f, List<Voyageur> voyageurs) {
		v.setDestination(d);
		v.setFormule(f);
		v.addVoyageur(voyageurs);
	}
	public void supprimer(Client c) {
	clients.remove(clients.indexOf(c));
	c.setId(null);
	}

	@Override
	public void update (Client c, String nom, String numero ) {
		c.setNom(nom);
		c.setNumero(numero);
		
	}
	public void supprimer(Voyageur v1) {
		voyageurs.remove(voyageurs.indexOf(v1));
		v1.setId(null);
		}
	
	@Override
	public Voyage findVoyageById(Long id) {
		for (Voyage v:voyages) {
		if (v.getId()==id) {
			return v;
		}	
	} return null;
	}
	
	@Override
	public List<Voyage> findVoyageByClient(Client c){
		return c.getVoyages();
		}
	
	@Override
	public List<Voyage> findVoyagesbyVoyageur(Voyageur v1) {
			List<Voyage> voyages = new ArrayList<Voyage>();
			for (Long idVoyage : v1.getIdVoyages()) {
			Voyage v=findVoyageById(idVoyage);
			voyages.add(v);
		}
		return voyages; 
	}
	}
	
