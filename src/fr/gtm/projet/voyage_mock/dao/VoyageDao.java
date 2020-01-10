package fr.gtm.projet.voyage_mock.dao;

import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.entities.Client;
import fr.gtm.projet.voyage_mock.entities.Voyage;
import fr.gtm.projet.voyage_mock.entities.Voyageur;
/**
 * 
 * @author Amine et Myriam
 * 
 * Interface offrant le vocabulaire méthode pour travailler sur les classes liées au VoyageMock.
 */
public interface VoyageDao {

	void creer(Voyage v);

	void supprimer(Voyage v);

	void update(Voyage v, Destination d, Formule f, List<Voyageur> voyageurs);

	Voyage findVoyageById(Long id);

	List<Voyage> findVoyageByClient(Client c);

	List<Voyage> findVoyagesbyVoyageur(Voyageur v1);

	void creer(Client c);

	void creer(Voyageur v1);

	void update(Client c, String nom, String numero);
	
	


}
