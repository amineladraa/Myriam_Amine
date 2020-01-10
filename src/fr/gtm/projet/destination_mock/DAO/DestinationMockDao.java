package fr.gtm.projet.destination_mock.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
/**
 * 
 * @author Amine et Myriam
 * Classe Mock qui implémente l'interface DestinationDAO
 *
 */
public class DestinationMockDao implements DestinationDao {

	
	// code des methodes qui sont des destDAO interface

List<Destination> destinations = new ArrayList<Destination>();
List<Formule> allFormules = new ArrayList<Formule>();


private static long id = 0;

/**
 * id est la variable qui permet la gestion des identifiants BDD sans redondance à partir de 1 
 * Le constructeur permet de réinitialiser à 0 la variable id 
 * 
 * Cela permet de ne pas provoquer des problemes sur JUnit
 */
	public DestinationMockDao() {
	id = 0;
}


	
	/**
	 * Méthode qui permet de creer la destination sur la BDD et non de creer l'objet
	 */
@Override
public void creer(Destination d) {
		d.setId(++id);
		destinations.add(d);
	
	}
/**
 * Méthode qui permet de creer la formule sur la BDD et non de creer l'objet
 */
@Override
public void creer(Formule f) {
	f.setId(++id);
	allFormules.add(f);
	
}
/**
 * Méthode qui permet de supprimer la formule sur la BDD et non de creer l'objet
 */
@Override
public void supprimer(Formule f) {
	allFormules.remove(f);
	f.setId(null);
}

/**
 * Méthode qui permet de modifier  les attributs prix, nbPlace et description de l'objet f de type Formule
 */
@Override
public void update(Formule f, double prix, int nbPlace, String description) {
	f.setPrix(prix);
	f.setNbPlace(nbPlace);
	f.setDescription(description);
	
}

/**
 * Methode pour retrouver l'objet de type Formule à partir de son id
 */
@Override
public Formule findFormuleById(Long id) {
		for (Formule f:allFormules) {
		if (f.getId()==id) {
			return f;
		}	
	} return null;
	}

	

/**
 * Méthode qui permet de supprimer la destination sur la BDD et non de creer l'objet
 */
@Override
public void supprimer(Destination d) {
	destinations.remove(destinations.indexOf(d));
	d.setId(null);
}
/**
 * Méthode qui permet de modifier  les attributs nom et description de l'objet d de type Destination
 */
@Override
public void update(Destination d, String nom, String description) {
	d.setNom(nom);
	d.setDescription(description);
	
}
/**
 * Methode pour retrouver l'objet de type Destination à partir de son id
 */
@Override
public Destination findDestinationById(Long id) {
	for (Destination d:destinations) {
		if (d.getId()==id) {
			return d;
		}	
	} return null;
	}

/**
 * Methode pour avoir comme retour la liste de toutes les destinations créées sur la BDD 
 * @see creer()
 */
@Override
public List<Destination> findAllDestinations() {
	return destinations;
}










}
