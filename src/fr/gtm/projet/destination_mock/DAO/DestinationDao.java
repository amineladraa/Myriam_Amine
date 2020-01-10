package fr.gtm.projet.destination_mock.DAO;

import java.time.LocalDate;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
 

/**
 * 
 * @author Amine et Myriam
 * 
 * Interface offrant le vocabulaire méthode pour travailler sur les classes liées au destinationMock.
 */
public interface DestinationDao {
//les fonction qui vont etre definie dans mock dao
	
	void creer(Destination d);
	void supprimer(Destination d);
	void update(Destination d, String nom, String description);
	Destination findDestinationById(Long id);
	List<Destination> findAllDestinations();
	void creer(Formule f);
	void supprimer(Formule f);
	void update(Formule f, double prix, int nbPlace, String description);
	Formule findFormuleById(Long id);
	
	
}
	

	
	
	