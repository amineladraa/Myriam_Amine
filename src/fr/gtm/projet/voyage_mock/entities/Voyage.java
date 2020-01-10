package fr.gtm.projet.voyage_mock.entities;


import java.util.ArrayList;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;
/**
 * 
 * @author Amine et Myriam
 *Classe voyage
 */
public class Voyage {
	
	private Long id;
	private Formule formule;
	private Destination destination;
	private VoyageMockDao voyageMockDao;
	List <Voyageur> voyageurs = new ArrayList<Voyageur>();
	

	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	
/**
 * 
 * @param list
 * 
 * le code tient compte du cahier des charges qui limite à 9 personnes le nombre de Voyageurs dans un Voyage
 */
	public void addVoyageur(List<Voyageur> list) {
		
		if (list.size()<=9) {
		for (Voyageur voyageur : list) {
			voyageurs.add(voyageur);
		}
	}
	}		

	public VoyageMockDao getVoyageMockDao() {
		return voyageMockDao;
	}


	public Formule getFormule() {
		return formule;
	}

	public void setFormule(Formule formule) {
		this.formule = formule;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Voyage() {
	
		
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public double getPrix() {
		return (formule.getPrix()*getVoyageurs().size());
	}
	
	/**
	 * 
	 * @param voyageurs
	 * 
	 * La méthode permet d'ajouter dans la liste IdVoyageur du Voyageur l'id du Voyage 
	 * Permet de retrouver rapidement les voyages auxquels a participé un voyageur
	 * 
	 * @see List<Voyage> findVoyagesbyVoyageur(Voyageur v1)
	 *  qui renvoie la liste des voyages
	 */
	public void attribuerIdVoyage(List<Voyageur> voyageurs) {
		
		for (Voyageur voyageur : voyageurs) {
				voyageur.addIdVoyage(this.getId());
			}
		
	}

}
