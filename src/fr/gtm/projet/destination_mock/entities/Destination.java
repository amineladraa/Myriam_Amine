package fr.gtm.projet.destination_mock.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Amine et Myriam
 * 
 * Classe publique pour les objets de type Destination
 *
 */
public class Destination {

	private String nom;
	private String description;
	private Long id;
	List<String> images= new ArrayList<String>();
	List<Formule> formules = new ArrayList<Formule>();
	
	
	public void addImage(String image) {
		images.add(image);
	}
	
	public void addFormule(Formule f) {
		formules.add(f);
	}
	
	public Destination(String nom) {
		this.nom = nom;
	}

	
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<Formule> getFormules() {
		return formules;
	}

	public void setFormules(List<Formule> formules) {
		this.formules = formules;
	}

	
	
}
