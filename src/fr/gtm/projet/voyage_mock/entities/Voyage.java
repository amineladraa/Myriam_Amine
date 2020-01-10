package fr.gtm.projet.voyage_mock.entities;


import java.util.ArrayList;
import java.util.List;

import fr.gtm.projet.destination_mock.entities.Destination;
import fr.gtm.projet.destination_mock.entities.Formule;
import fr.gtm.projet.voyage_mock.dao.VoyageMockDao;

public class Voyage {
	
	private Long id;
	private Formule formule;
	private Destination destination;
	private String region;
	private String descriptif;
	private VoyageMockDao voyageMockDao;
	List <Voyageur> voyageurs = new ArrayList<Voyageur>();
	

	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}

	

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


	public Formule getF() {
		return formule;
	}

	public void setF(Formule f) {
		this.formule = f;
	}

	public Destination getD() {
		return destination;
	}

	public void setD(Destination d) {
		this.destination = d;
	}

	public Voyage() {
	
		
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public double getPrix() {
		return formule.getPrix();
	}
	
	public void commander(Voyage v,List<Voyageur> voyageurs) {
		if(voyageurs.size()<=formule.getNbPlace()) {
			this.setD(this.destination);
			this.setF(this.formule);
			this.addVoyageur(voyageurs);
			voyageMockDao.creer(v);
			for (Voyageur voyageur : voyageurs) {
				voyageur.addIdVoyage(v.getId());
			}
			formule.setNbPlace(formule.getNbPlace()-voyageurs.size());
		}
	}

}
